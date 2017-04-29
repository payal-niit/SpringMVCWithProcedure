package com.ecjcoach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecjcoach.daoimplementation.ECJ_Job_Opening_DAOImplementation;
import com.ecjcoach.model.Job_dtls_vw;
import com.ecjcoach.model.Job_posting_dtls;

@Service
@Transactional
public class ECJ_Job_Opening_Service {

	@Autowired
	private ECJ_Job_Opening_DAOImplementation ecj_Job_Opening_DAOImplementation;
	
	public String createJobOpening(Job_posting_dtls job_posting_dtls) {
		
		return ecj_Job_Opening_DAOImplementation.createJobOpening(job_posting_dtls);
	}
	public List<Job_dtls_vw> listJobOpenings() {
		return ecj_Job_Opening_DAOImplementation.listJobOpenings();
	}
	
}
