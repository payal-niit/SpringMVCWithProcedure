package com.ecjcoach.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecjcoach.daoimplementation.Cust_Rsm_Dtls_DAOImplementation;
import com.ecjcoach.model.Cust_rsm_dtls;

@Service
@Transactional
public class Cust_Rsm_Dtls_Service {
	@Autowired
	private Cust_Rsm_Dtls_DAOImplementation cust_Rsm_Dtls_DAOImplementation;
	
	public String createResumeDetails(Cust_rsm_dtls cust_Rsm_Dtls, String username, String path) {
		
		return cust_Rsm_Dtls_DAOImplementation.createResumeDetails(cust_Rsm_Dtls, username, path);
	}
	
	public String listResumeDetails(String username) {
		return cust_Rsm_Dtls_DAOImplementation.listResumeDetails(username);
	}

}
