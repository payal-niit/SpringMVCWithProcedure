package com.ecjcoach.dao;

import java.util.List;

import com.ecjcoach.model.Mst_cmpny_dtls;
import com.ecjcoach.model.Mst_job_cat_dtls;
import com.ecjcoach.model.Mst_job_prffl_dtls;

public interface ECJ_Job_DAO {

	
	public String createIndustry(Mst_job_cat_dtls mst_job_cat_dtls);
	public String createJobProfile(Mst_job_prffl_dtls mst_job_prffl_dtls, String job_cat_id);
	public String createCompanyProfile(Mst_cmpny_dtls mst_cmpny_dtls);
	
	public List<Mst_job_cat_dtls> listIndustries();
	public List<Mst_job_prffl_dtls> listJobProfiles();
	public List<Mst_cmpny_dtls> listCompanies();
	public String listIndustry();
	public Mst_job_cat_dtls getIdByname(String job_industry);
}
