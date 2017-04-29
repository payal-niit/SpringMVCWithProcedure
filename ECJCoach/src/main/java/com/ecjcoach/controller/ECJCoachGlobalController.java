package com.ecjcoach.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.ecjcoach.service.Cust_Persnl_Dtls_Service;

@ControllerAdvice
public class ECJCoachGlobalController {
	
	@Autowired
	private  Cust_Persnl_Dtls_Service cust_persnl_dtls_service;
	
		//Method for Global User first name and last name
		@ModelAttribute("user")
	    public String populateUser() {
	    	
		try{
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			 
			 String username = authentication.getName();
			 String user = cust_persnl_dtls_service.getuserByName(username).getCust_fname()+" ";
			 user = user.concat(cust_persnl_dtls_service.getuserByName(username).getCust_lname());
			 return user;
			 }
			 
			 catch(IndexOutOfBoundsException exception){
				 System.out.println("User not logged in");
				 return "";
			 }
			 
		 	
	    }
	
}
