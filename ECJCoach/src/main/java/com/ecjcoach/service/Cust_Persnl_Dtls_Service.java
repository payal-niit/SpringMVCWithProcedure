package com.ecjcoach.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecjcoach.daoimplementation.Cust_Persnl_Dtls_DAOImplementation;

import com.ecjcoach.model.Cust_prsnl_dtls;


@Service

public class Cust_Persnl_Dtls_Service {
	
	@Autowired
	private Cust_Persnl_Dtls_DAOImplementation cust_persnl_dtls_dao;
	
	@Transactional
	public String createCustomer(Cust_prsnl_dtls cust_persnl_dtls) {
		return cust_persnl_dtls_dao.createCustomer(cust_persnl_dtls);
	}
	
	@Transactional
	public void updateCustomer(Cust_prsnl_dtls cust_persnl_dtls) {
		cust_persnl_dtls_dao.updateCustomer(cust_persnl_dtls);
	}
	
	
	@Transactional
	public String otpFlagCheck(String emailId)
	{
		return cust_persnl_dtls_dao.otpFlagCheck(emailId);
	}
	
	@Transactional
	public void updateProfileImageFlag(String username, String path)
	{
		cust_persnl_dtls_dao.updateProfileImageFlag(username, path);
	}
	
	@Transactional
	public String gePersonByUsername(String username){
		return cust_persnl_dtls_dao.gePersonByUsername(username);
		
	}
	@Transactional
	public Cust_prsnl_dtls getuserByName(String username) {
		return cust_persnl_dtls_dao.getuserByName(username);
	}
	
	@Transactional
	public String otpCheck(String otpNumber, String emailId) {
		return cust_persnl_dtls_dao.otpCheck(otpNumber, emailId);
	}
	@Transactional
	public Cust_prsnl_dtls getIdByName(String cust_eml_addrss) {
		return cust_persnl_dtls_dao.getIdByName(cust_eml_addrss);
	}
}
