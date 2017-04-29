package com.ecjcoach.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class ECJCoachController {

	
	//Landing page mapping
	@RequestMapping("/")
	public String getHome( Model model)
	{
		
		return "index";
	}
	
	//login page mapping
	@RequestMapping(value="/login")
	public String login()
	{
		return "login";
	}
	
	
	//Logout handler
	@RequestMapping(value="/perform_logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpServletResponse response)
	{
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if(authentication!=null)
		{
			new SecurityContextLogoutHandler().logout(request, response, authentication);
		}
		return "redirect:/";
	}
}
