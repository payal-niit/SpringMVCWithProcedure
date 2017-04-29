package com.ecjcoach.service;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecjcoach.daoimplementation.Cust_Wrk_Dtls_DAOImplementation;
import com.ecjcoach.model.Cust_exp_dtls;
@Service
@Transactional
public class Cust_Wrk_Dtls_Service {
	@Autowired
	private Cust_Wrk_Dtls_DAOImplementation cust_Wrk_Dtls_DAOImplementation;
	
	public String createWorkDetails(Cust_exp_dtls cust_exp_dtls, Principal p) {
		return cust_Wrk_Dtls_DAOImplementation.createWorkDetails(cust_exp_dtls, p);
	}
	
	public List<Cust_exp_dtls> getWorkListById(String cust_id) {
		return cust_Wrk_Dtls_DAOImplementation.getWorkListById(cust_id);
	}

}
