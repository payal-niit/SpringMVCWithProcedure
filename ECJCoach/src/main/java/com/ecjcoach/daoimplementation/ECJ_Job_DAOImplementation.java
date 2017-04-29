package com.ecjcoach.daoimplementation;

import java.util.List;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecjcoach.dao.ECJ_Job_DAO;
import com.ecjcoach.model.Mst_cmpny_dtls;
import com.ecjcoach.model.Mst_job_cat_dtls;
import com.ecjcoach.model.Mst_job_prffl_dtls;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Repository
public class ECJ_Job_DAOImplementation implements ECJ_Job_DAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	//Implementation of create new Industry 
	public String createIndustry(Mst_job_cat_dtls mst_job_cat_dtls) {
		// TODO Auto-generated method stub
		StoredProcedureQuery query = sessionFactory.getCurrentSession().createStoredProcedureQuery("mst_job_cat_prc")
				.registerStoredProcedureParameter("p_job_industry", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("rst", String.class, ParameterMode.OUT);
		
		query.setParameter("p_job_industry", mst_job_cat_dtls.getJob_industry());
		
		String msg =   (String) query.getOutputParameterValue("rst");
		return msg;
	}

	//implementation of create new job profile
	public String createJobProfile(Mst_job_prffl_dtls mst_job_prffl_dtls, String job_cat_id) {
		
		StoredProcedureQuery query = sessionFactory.getCurrentSession().createStoredProcedureQuery("mst_job_prffl_prc")
				.registerStoredProcedureParameter("p_job_cat_id", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_job_industry_prffl", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("rst", String.class, ParameterMode.OUT);
		
		query.setParameter("p_job_cat_id", job_cat_id);
		query.setParameter("p_job_industry_prffl", mst_job_prffl_dtls.getJob_industry_prffl());
		String msg =   (String) query.getOutputParameterValue("rst");
		System.out.println(msg);
		return msg;
	}

	//implementation for adding new company details
	public String createCompanyProfile(Mst_cmpny_dtls mst_cmpny_dtls) {
		
		StoredProcedureQuery query = sessionFactory.getCurrentSession().createStoredProcedureQuery("mst_cmpny_dtls_prc")
				.registerStoredProcedureParameter("p_cmpny_nm", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cmp_addrss", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cmp_cntct_nmbr", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cmp_eml_addrss", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cmp_desc", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("rst", String.class, ParameterMode.OUT);
		
		query.setParameter("p_cmpny_nm", mst_cmpny_dtls.getCmpny_nm());
		query.setParameter("p_cmp_addrss", mst_cmpny_dtls.getCmp_addrss());
		query.setParameter("p_cmp_cntct_nmbr", mst_cmpny_dtls.getCmp_cntct_nmbr());
		query.setParameter("p_cmp_eml_addrss", mst_cmpny_dtls.getCmp_eml_addrss());
		query.setParameter("p_cmp_desc", mst_cmpny_dtls.getCmp_desc());
		String msg =   (String) query.getOutputParameterValue("rst");
		System.out.println("Details Created with : "+msg);
		return msg;
	}
	
	//Gson list of Industry type
	@SuppressWarnings("unchecked")
	public String listIndustry() {
		
		List<Mst_job_cat_dtls> list = sessionFactory.getCurrentSession().createQuery("from Mst_job_cat_dtls").getResultList();
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		String listIndustry = gson.toJson(list);
		return listIndustry;
	}

	//method for fetching particular job industry details
	public Mst_job_cat_dtls getIdByname(String job_industry) {
		
		String hql = "from Mst_job_cat_dtls where job_industry='"+job_industry+"'";
		@SuppressWarnings("unchecked")
		List<Mst_job_cat_dtls> list = sessionFactory.getCurrentSession().createQuery(hql).getResultList();
		
		if(list != null && !list.isEmpty())
		{
			
			return list.get(0);
		}
		else
		{
		return null;
		}
	}

	//method for fetching all job industries
	@SuppressWarnings("unchecked")
	public List<Mst_job_cat_dtls> listIndustries() {
		
		List<Mst_job_cat_dtls> list = sessionFactory.getCurrentSession().createQuery("from Mst_job_cat_dtls").getResultList();
		return list;
	}

	//method for fetching all job profiles
	@SuppressWarnings("unchecked")
	public List<Mst_job_prffl_dtls> listJobProfiles() {
		
		List<Mst_job_prffl_dtls> list = sessionFactory.getCurrentSession().createQuery("from Mst_job_prffl_dtls").getResultList();
		return list;
	}

	//method for fetching all companies
	@SuppressWarnings("unchecked")
	public List<Mst_cmpny_dtls> listCompanies() {
		
		List<Mst_cmpny_dtls> list = sessionFactory.getCurrentSession().createQuery("from Mst_cmpny_dtls").getResultList();
		return list;
	}

	

}
