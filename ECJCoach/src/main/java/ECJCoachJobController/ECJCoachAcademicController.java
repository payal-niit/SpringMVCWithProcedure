package ECJCoachJobController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecjcoach.service.AcademicForm;
import com.ecjcoach.service.Cust_Acad_Dtls_Service;

@Controller
public class ECJCoachAcademicController {
	@Autowired
	Cust_Acad_Dtls_Service cust_Acad_Dtls_Service;
	
	@RequestMapping("/addAcademicDetails")
	public String addAcademicDetails(@ModelAttribute("academicForm") AcademicForm academicForm) {
		
		return "redirect:/profile";
	}

}
