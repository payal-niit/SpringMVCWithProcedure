package com.ecjcoach.dao;

import java.util.List;

import com.ecjcoach.model.Job_dtls_vw;
import com.ecjcoach.model.Job_posting_dtls;

public interface ECJ_Job_Opening_DAO {

	public String createJobOpening(Job_posting_dtls job_posting_dtls);
	public List<Job_dtls_vw> listJobOpenings();
	
}
