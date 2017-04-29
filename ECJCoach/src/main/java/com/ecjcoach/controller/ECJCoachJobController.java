package com.ecjcoach.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecjcoach.model.Job_dtls_vw;
import com.ecjcoach.model.Job_posting_dtls;
import com.ecjcoach.model.Mst_cmpny_dtls;
import com.ecjcoach.model.Mst_job_cat_dtls;
import com.ecjcoach.model.Mst_job_prffl_dtls;
import com.ecjcoach.service.ECJ_Job_Opening_Service;
import com.ecjcoach.service.ECJ_Job_Service;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Controller
public class ECJCoachJobController {
	
	@Autowired
	private ECJ_Job_Service ecj_Job_Service;
	@Autowired
	private ECJ_Job_Opening_Service ecj_Job_Opening_Service;
	
	//Request mapping for admin job panel
	@RequestMapping("/job_admin")
	public String jobAdmin(Model model)
	{
		model.addAttribute("mst_cmpny_dtls", new Mst_cmpny_dtls());
		model.addAttribute("mst_job_cat_dtls", new Mst_job_cat_dtls());
		model.addAttribute("mst_job_prffl_dtls", new Mst_job_prffl_dtls());
		model.addAttribute("job_posting_dtls", new Job_posting_dtls());
		
		model.addAttribute("listIndustry", ecj_Job_Service.listIndustries());
		model.addAttribute("listProfiles", ecj_Job_Service.listJobProfiles());
		model.addAttribute("listCompanies", ecj_Job_Service.listCompanies());
		return "job_admin";
	}
	
	@RequestMapping(value="/createJobOpening", method=RequestMethod.POST)
	public String createJobOpening(@ModelAttribute("job_posting_dtls")Job_posting_dtls job_posting_dtls, HttpSession session, Model model){
		String outputmsg = ecj_Job_Opening_Service.createJobOpening(job_posting_dtls);
		
		if(outputmsg.equals("1")){
			session.setAttribute("error", "Record already exists");
	
		}else{
			session.setAttribute("error", "Record successfully inserted");
		}
		
		return "redirect:/job_admin";
	}
	
	@RequestMapping("/all_jobs")
	public String getAllJob(Model model)
	{
		List<Job_dtls_vw> list= ecj_Job_Opening_Service.listJobOpenings();
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		String listJob = gson.toJson(list);
		model.addAttribute("listJob",listJob);
		return "all_jobs";
	}
	
	//Request mapping for company profile form
	@RequestMapping("/company_profile")
	public String getJob(Model model)
	{
		model.addAttribute("mst_cmpny_dtls", new Mst_cmpny_dtls());
		return "job_home";
	}
	
	//Request mapping for adding company 
	@RequestMapping(value="/createCompany", method=RequestMethod.POST)
	public String createCompanyProfile(@ModelAttribute("mst_cmpny_dtls")Mst_cmpny_dtls mst_cmpny_dtls, HttpSession session, Model model){
		String outputmsg = ecj_Job_Service.createCompanyProfile(mst_cmpny_dtls);
		
		if(outputmsg.equals("1")){
			session.setAttribute("error", "Record already exists");
	
		}else{
			session.setAttribute("error", "Record successfully inserted");
		}
		
		return "redirect:/job_admin";
	}
	
	//Request mapping for job profiles form
	@RequestMapping(value="/jobProfiles")
	public String getJobProfiles(Model model)
	{
		model.addAttribute("mst_job_cat_dtls", new Mst_job_cat_dtls());
		model.addAttribute("mst_job_prffl_dtls", new Mst_job_prffl_dtls());
		model.addAttribute("listIndustry", ecj_Job_Service.listIndustries());
		return "job_profiles";
	}
	
	//Request mapping for creating new Industry type
	@RequestMapping(value="/createIndustry", method=RequestMethod.POST)
	public String createIndustry(@ModelAttribute("mst_job_cat_dtls") Mst_job_cat_dtls mst_job_cat_dtls, Model model, HttpSession session){
		String outputmsg = ecj_Job_Service.createIndustry(mst_job_cat_dtls);
		if(outputmsg.equals("1")){
			session.setAttribute("error1", "Record already exists");
	
		}else{
			session.setAttribute("error1", "Record successfully inserted");
		}
	
		model.addAttribute("listIndustry", ecj_Job_Service.listIndustries());
		return "redirect:/job_admin";
	}
	
	//Request mapping for creating new job profile
	@RequestMapping(value="/createJobProfile", method=RequestMethod.POST)
	public String createJobProfile(@ModelAttribute("mst_job_prffl_dtls") Mst_job_prffl_dtls mst_job_prffl_dtls, Model model, HttpSession session){
		model.addAttribute("listIndustry", ecj_Job_Service.listIndustries());
		Mst_job_cat_dtls mst_job_cat_dtls = ecj_Job_Service.getIdByname(mst_job_prffl_dtls.getMst_job_cat_dtls().getJob_industry());
		String job_cat_id = mst_job_cat_dtls.getJob_cat_id();
		String outputmsg = ecj_Job_Service.createJobProfile(mst_job_prffl_dtls, job_cat_id);
		if(outputmsg.equals("1")){
			session.setAttribute("error2", "Record already exists");
	
		}else{
			session.setAttribute("error2", "Record successfully inserted");
		}
		return "redirect:/job_admin";
	}
	
}
