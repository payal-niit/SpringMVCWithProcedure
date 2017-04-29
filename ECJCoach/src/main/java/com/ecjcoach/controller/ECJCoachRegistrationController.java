package com.ecjcoach.controller;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URI;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.ecjcoach.model.Cust_acad_dtls;
import com.ecjcoach.model.Cust_exp_dtls;
import com.ecjcoach.model.Cust_prsnl_dtls;
import com.ecjcoach.model.Cust_rsm_dtls;
import com.ecjcoach.model.Mst_acad_dtls;
import com.ecjcoach.service.AcademicForm;
import com.ecjcoach.service.Cust_Acad_Dtls_Service;
import com.ecjcoach.service.Cust_Persnl_Dtls_Service;
import com.ecjcoach.service.Cust_Rsm_Dtls_Service;
import com.ecjcoach.service.Cust_Wrk_Dtls_Service;
import com.ecjcoach.service.WorkForm;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Controller
public class ECJCoachRegistrationController {
	
	@Autowired
	private  Cust_Persnl_Dtls_Service cust_persnl_dtls_service; 

	@Autowired
	private Cust_Acad_Dtls_Service cust_Acad_Dtls_Service;
	
	@Autowired
	private Cust_Rsm_Dtls_Service cust_Rsm_Dtls_Service;
	
	@Autowired
	protected AuthenticationManager authenticationManager;
	
	@Autowired
	private Cust_Wrk_Dtls_Service cust_Wrk_Dtls_Service;
	
	// METHOD FOR MANUAL LOGIN SPRING SECURITY
	private void authenticateUserAndSetSession(String username,String password, HttpServletRequest request) {
         
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);

        // generate session if one doesn't exist
        request.getSession();
        
        token.setDetails(new WebAuthenticationDetails(request));
        Authentication authenticatedUser = authenticationManager.authenticate(token);
        
        SecurityContextHolder.getContext().setAuthentication(authenticatedUser);
        
    }
	
	// METHOD USED TO CHECK BEFORE LOGIN IF OTPFLAG IS TRUE OR FALSE, IF TRUE THEN LOGIN , IF FALSE THEN GO TO OTP FORM
	@RequestMapping(value = "/perform_login_otpcheck", method=RequestMethod.POST)
	public String otpCheck(HttpServletRequest request, HttpSession session)
	{
		String username = request.getParameter("cust_eml_addrss");
		String password = request.getParameter("password");
		
		//Method to check if flag is 'N' or 'Y'
		try
		{
		String chk = cust_persnl_dtls_service.otpFlagCheck(username).toString();
		
		//If Y then

		if(chk.equals("Y"))
		{
		session.setAttribute("currentRegisteredUser", username);
		authenticateUserAndSetSession(username,password,request);
		System.out.println("User "+username+" has logged in.");
		}
		else
		{
			session.setAttribute("currentRegisteredUser", username);
			session.setAttribute("password", password);
			return "registration_basic_form_otp";
		}
		return "redirect:/";
		}
		catch(Exception e)
		{
			if(e.getMessage() == null)
			{
				session.setAttribute("error", "No Such User Details");
				return "redirect:/login";
			}
			else
			{
				session.setAttribute("error", e.getMessage());
				return "redirect:/login";
			
			}
		}		
				
	}
	
	// METHOD THAT IS CALLED WHEN USER PRESSES THE REGISTER BUTTON    
	@RequestMapping(value="/register")
	public String regis(Model model)
	{
		model.addAttribute("cust_prsnl_dtls", new Cust_prsnl_dtls());
		
		return "registration_basic_form";
	}
	
	// METHOD THAT IS CALLED WHEN USER GOES TO PROFILE PAGE
	@RequestMapping(value="/profile")	
	public String profile(Model model, HttpSession session)
	{
		String listResumeDetails = "{}";
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String username = authentication.getName();
		
		//Lists called at profile page
		String listCustomerPersonalDetails = "{"+cust_persnl_dtls_service.gePersonByUsername(username)+"}";
		if(cust_Rsm_Dtls_Service.listResumeDetails(username) != null)
		{
		listResumeDetails = "{"+cust_Rsm_Dtls_Service.listResumeDetails(username)+"}";
		}
		//Model attributes for fetching data
		model.addAttribute("userResumeDetailsListViaJson", listResumeDetails);
		model.addAttribute("userDetailsParticularListViaJson", listCustomerPersonalDetails);
		
		
		List<Mst_acad_dtls> listmst = cust_Acad_Dtls_Service.listMstDtls();
		Gson gson = new Gson();
		String abc = gson.toJson(listmst);
		model.addAttribute("mstAcadDtls",abc);
		
		//via jstl
		model.addAttribute("mstAcadDtlsViaJstl",listmst);
		
		//Model attributes for the forms
		model.addAttribute("cust_prsnl_dtls", new Cust_prsnl_dtls());
		model.addAttribute("cust_rsm_dtls",new Cust_rsm_dtls());
		
		//used for adding multiple academic records at one go
		AcademicForm academicForm = new AcademicForm();
		model.addAttribute("academicForm",academicForm);
		
		List<Cust_acad_dtls> dtls = new ArrayList<Cust_acad_dtls>();
	    for(int i=0; i<10; i++) {
	    	dtls.add(new Cust_acad_dtls());
	    }
	    academicForm.setDtls(dtls);
	    String cust_id = cust_persnl_dtls_service.getIdByName(username).getCust_id();
	    
	    model.addAttribute("academicList", cust_Acad_Dtls_Service.getAcadListById(cust_id));
	    
	    int countAcad=cust_Acad_Dtls_Service.getAcadListById(cust_id).size();
	    session.setAttribute("countAcad", countAcad);
	  
	    
	    //used for adding multiple WORK records at one go
	    WorkForm workForm = new WorkForm();
		model.addAttribute("workForm",workForm);
		
		List<Cust_exp_dtls> expls = new ArrayList<Cust_exp_dtls>();
	    for(int i=0; i<10; i++) {
	    	expls.add(new Cust_exp_dtls());
	    }
	    workForm.setExpls(expls);
	    
	    model.addAttribute("WorkDetailById", cust_Wrk_Dtls_Service.getWorkListById(cust_id));
	    int countWork = cust_Wrk_Dtls_Service.getWorkListById(cust_id).size();
	    session.setAttribute("countWork", countWork);
		
		return "customer_details_forms";
	}
	
	//ANOTHER METHOD USED TO ACCESS PROFILE PAGE
	@RequestMapping(value="/profileNew")
	public ModelAndView viewproductdetails(@ModelAttribute Cust_prsnl_dtls cust_prsnl_dtls) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String username = authentication.getName();
		
		Cust_prsnl_dtls c=cust_persnl_dtls_service.getuserByName(username);
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		String prd=gson.toJson(c);		
		
		ModelAndView model = new ModelAndView("customer_details_forms");
		model.addObject("userDetailsParticularListViaJson", prd);
		model.addObject("p", c);
		
		return model;
	}
	
	// METHOD THAT IS CALLED WHEN PERSON REGISTERS
	@RequestMapping(value="/registersubmit", method=RequestMethod.POST)
	public String registerSubmit(Model model, @ModelAttribute("cust_prsnl_dtls") Cust_prsnl_dtls cust_persnl_dtls, HttpSession session){
		String msg = cust_persnl_dtls_service.createCustomer(cust_persnl_dtls);	
		if(msg.equals("1"))
		{
			session.setAttribute("error","User Already Exists");
			return "registration_basic_form";
		}
		else
		{
			session.setAttribute("currentRegisteredUser", cust_persnl_dtls.getCust_eml_addrss());
			session.setAttribute("password", cust_persnl_dtls.getCust_psswd());
			return "registration_basic_form_otp";
		}
		
	}
	
	// METHOD THAT IS CALLED WHEN PERSON UPDATES
	@RequestMapping(value="/registerupdate", method=RequestMethod.POST)
		public String registerUpdate(Model model, @ModelAttribute("cust_prsnl_dtls") Cust_prsnl_dtls cust_persnl_dtls, HttpSession session){
			cust_persnl_dtls_service.updateCustomer(cust_persnl_dtls);
			return "redirect:/profile";
		}
	
	// METHOD THAT IS CALLED WHEN OTP FLAG IS 'N' FOR USER
	@RequestMapping(value="/registerotp", method=RequestMethod.POST)
	public String registerOTP(HttpServletRequest request, HttpSession session)
	{

		String username = (String) session.getAttribute("currentRegisteredUser");
		
		// CHECK IF CORRECT OR WRONG
		String i = cust_persnl_dtls_service.otpCheck(request.getParameter("OTP").toString(), username);
		
		if(i.equals("0"))
		{
			
			String password = (String) session.getAttribute("password");
			authenticateUserAndSetSession(username,password,request);
			System.out.println("User "+username+" has logged in.");
			return "redirect:/";
		}
		else if(i.equals("1"))
		{
			session.setAttribute("otpMessage", "Wrong OTP - Please Enter Again");
			return "registration_basic_form_otp";
		}
		else if(i.equals("2"))	
		{
			session.setAttribute("otpMessage", "OTP Expired - Enter New OTP Sent");
			return "registration_basic_form_otp";
		}
		
		return "redirect:/";

	}
	
	// METHOD FOR TAKING USER PROFILE IMAGE
	@RequestMapping(value="/userprofileimage",method=RequestMethod.POST)
	public String uploadImage(@ModelAttribute("cust_prsnl_dtls") Cust_prsnl_dtls cust_persnl_dtls, HttpSession session)
	{

		try
		{
		String username =(String) session.getAttribute("currentRegisteredUser");
		String path = "";
		MultipartFile m = cust_persnl_dtls.getPrf_image();
			if(!m.isEmpty())
			{
			
			path = "file:/D:/Softwares/ECJCoach/ECJCoach/src/main/webapp/resources/images/profileImages/";
			String type = m.getOriginalFilename().split("\\.")[1];
				if(type.equals("jpg") || type.equals("png") || type.equals("jpeg"))
				{
				System.out.println("Image Type Uploaded "+type);
				path = path+""+username+".jpg";
				File f = new File(new URI(path));
				byte[] b = m.getBytes();
				FileOutputStream fos = new FileOutputStream(f);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				bos.write(b);
				bos.close();
				}
				else
				{
					session.setAttribute("error", "Wrong Image Format. Only .jpg / .png / .jpeg files allowed");
					return "redirect:/profile";
				}
			}
			else
			{
				session.setAttribute("error", "Please Select a Image");
				return "redirect:/profile";
			}
			
			
		cust_persnl_dtls_service.updateProfileImageFlag(username, path);
		session.setAttribute("error", "Successfully Uploaded Image");
		return "redirect:/profile";
		}
		catch (Exception e) {
			
			session.setAttribute("error", "Failed To Upload Image");
			
			return "redirect:/profile";
		}
	}
	
	
	// METHOD FOR TAKING USER RESUME DOCUMENTATION
		@RequestMapping(value="/userresume",method=RequestMethod.POST)
		public String uploadResume(@ModelAttribute("cust_rsm_dtls") Cust_rsm_dtls cust_rsm_dtls, HttpSession session)
		{

			
			
			try
			{
			String username =(String) session.getAttribute("currentRegisteredUser");
			String path = "X";
			MultipartFile m = cust_rsm_dtls.getRsm_doc();
				if(!m.isEmpty())
				{

				path = "file:/D:/Softwares/ECJCoach/ECJCoach/src/main/webapp/resources/resumes/";
				String type = m.getOriginalFilename().split("\\.")[1];
				File f ;
					if(type.equals("doc") || type.equals("pdf") || type.equals("docx"))
					{
						
						if(type.equals("doc"))
						{
							String path_pdf = path+""+username+".pdf";		
							f = new File(new URI(path_pdf));
							if(f.exists()){
							f.delete();
							}
							String path_docx = path+""+username+".docx";		
							f = new File(new URI(path_docx));
							if(f.exists()){
							f.delete();
							}
							
						}
						
						if(type.equals("pdf"))
						{
							String path_doc = path+""+username+".doc";		
							f = new File(new URI(path_doc));
							if(f.exists()){
							f.delete();
							}
							String path_docx = path+""+username+".docx";		
							f = new File(new URI(path_docx));
							if(f.exists()){
							f.delete();
							}
							
						}
						
						if(type.equals("docx"))
						{
							String path_pdf = path+""+username+".pdf";		
							f = new File(new URI(path_pdf));
							if(f.exists()){
							f.delete();
							}
							String path_doc = path+""+username+".doc";		
							f = new File(new URI(path_doc));
							if(f.exists()){
							f.delete();
							}
							
						}
											
						path = path+""+username+"."+type;
						f = new File(new URI(path));			
							byte[] b = m.getBytes();
							FileOutputStream fos = new FileOutputStream(f);
							BufferedOutputStream bos = new BufferedOutputStream(fos);
							bos.write(b);
							bos.close();	
					}
					else
					{
						session.setAttribute("error", "Wrong File Format. Only .pdf / .doc / .docx files allowed.");
						return "redirect:/profile";
					}
				}
				
			cust_Rsm_Dtls_Service.createResumeDetails(cust_rsm_dtls, username, path);
			session.setAttribute("error", "Successfully Updated Resume Details");
			return "redirect:/profile";
			}
			catch (Exception e) {
				
				session.setAttribute("error", "Failed To Upload Resume Details. Please Check Entered Details & Try Again.");
				return "redirect:/profile";
			}
		}
		
		// METHOD FOR DOWNLOAD RESUME THROUGH AJAX CALL
		@RequestMapping(value = "/rsdllink", method = RequestMethod.POST)
		public @ResponseBody String getTags(HttpSession session) {
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			String username = authentication.getName();
			String message = "";
		try {
			String path = "file:/D:/Softwares/ECJCoach/ECJCoach/src/main/webapp/resources/resumes/"+username+".doc";
			String path1 = "file:/D:/Softwares/ECJCoach/ECJCoach/src/main/webapp/resources/resumes/"+username+".pdf";
			String path2 = "file:/D:/Softwares/ECJCoach/ECJCoach/src/main/webapp/resources/resumes/"+username+".docx";
			File f = new File(new URI(path));
			if(!f.exists())
			{
				f = new File(new URI(path1));
			}
			else
			{
				message = "resources/resumes/"+username+".doc";
				return message;
			}
			if(!f.exists())
			{
				f = new File(new URI(path2));
			}
			else
			{
				message = "resources/resumes/"+username+".pdf";
				return message;
			}
			if(!f.exists())
			{
				session.setAttribute("error", "File Not Found");
				message = "error";
				
			}
			else
			{
				message = "resources/resumes/"+username+".docx";
				return message;
			}

		} 
		catch (Exception e) {
			session.setAttribute("error", "File Not Found");
			message = "error";
		}
			return message;
		}
	
	@RequestMapping("/addAcademicDetails")
	public String addAcademicDetails(@ModelAttribute("academicForm") AcademicForm academicForm,Principal p) {
		
		for(Cust_acad_dtls cust_acad_dtls : academicForm.getDtls()) {
		       cust_Acad_Dtls_Service.createAcadDetails(cust_acad_dtls, p);
		    }
		return "redirect:/profile";
	}
	
	@RequestMapping("/addWorkDetails")
	public String addWorkDetails(@ModelAttribute("workForm") WorkForm workForm,Principal p) {
		
		for(Cust_exp_dtls cust_exp_dtls : workForm.getExpls()) {
		       cust_Wrk_Dtls_Service.createWorkDetails(cust_exp_dtls, p);
		    }
		return "redirect:/profile";
	}
	
}
