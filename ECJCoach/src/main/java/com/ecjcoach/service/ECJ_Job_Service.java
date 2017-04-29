package com.ecjcoach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecjcoach.daoimplementation.ECJ_Job_DAOImplementation;
import com.ecjcoach.model.Mst_cmpny_dtls;
import com.ecjcoach.model.Mst_job_cat_dtls;
import com.ecjcoach.model.Mst_job_prffl_dtls;

@Service
@Transactional
public class ECJ_Job_Service {

	@Autowired
	private ECJ_Job_DAOImplementation ecj_Job_DAOImplementation;
	
	public String createIndustry(Mst_job_cat_dtls mst_job_cat_dtls){
		
		return ecj_Job_DAOImplementation.createIndustry(mst_job_cat_dtls);
	}
	
	public String createJobProfile(Mst_job_prffl_dtls mst_job_prffl_dtls, String job_cat_id){
		return ecj_Job_DAOImplementation.createJobProfile(mst_job_prffl_dtls,  job_cat_id);
	}
	
	public String createCompanyProfile(Mst_cmpny_dtls mst_cmpny_dtls) {
		return ecj_Job_DAOImplementation.createCompanyProfile(mst_cmpny_dtls);
	}
	
	public String listIndustry(){
		return ecj_Job_DAOImplementation.listIndustry();
	}
	
	public Mst_job_cat_dtls getIdByname(String job_industry){
		return ecj_Job_DAOImplementation.getIdByname(job_industry);
	}
	
	public List<Mst_job_cat_dtls> listIndustries() {
		return ecj_Job_DAOImplementation.listIndustries();
	}
	
	public List<Mst_job_prffl_dtls> listJobProfiles() {
		return ecj_Job_DAOImplementation.listJobProfiles();
	}
		public List<Mst_cmpny_dtls> listCompanies() {
			return ecj_Job_DAOImplementation.listCompanies();
		}
}
