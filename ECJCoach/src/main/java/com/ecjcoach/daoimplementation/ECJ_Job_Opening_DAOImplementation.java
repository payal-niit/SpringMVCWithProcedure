package com.ecjcoach.daoimplementation;

import java.util.List;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecjcoach.dao.ECJ_Job_Opening_DAO;
import com.ecjcoach.model.Job_dtls_vw;
import com.ecjcoach.model.Job_posting_dtls;

@Repository
public class ECJ_Job_Opening_DAOImplementation implements ECJ_Job_Opening_DAO{

	@Autowired
	private SessionFactory sessionFactory;

	public String createJobOpening(Job_posting_dtls job_posting_dtls) {
		
		StoredProcedureQuery query = sessionFactory.getCurrentSession().createStoredProcedureQuery("job_posting_dtls_prc")
				.registerStoredProcedureParameter("p_cmpny_id", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_job_cat_id", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_job_prffl_id", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_skll_req", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_sal_rng_frm", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_sal_rng_to", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_acad_qual", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_job_desc", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_job_loc", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_exp_dtls", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cntct_prsn_nm", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cntct_nmbr", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cntct_eml_addrss", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("rst", String.class, ParameterMode.OUT);
		
		query.setParameter("p_cmpny_id", job_posting_dtls.getCmpny_id());
		query.setParameter("p_job_cat_id", job_posting_dtls.getJob_cat_id());
		query.setParameter("p_job_prffl_id", job_posting_dtls.getJob_prffl_id());
		query.setParameter("p_skll_req", job_posting_dtls.getSkll_req());
		query.setParameter("p_sal_rng_frm", job_posting_dtls.getSal_rng_frm());
		query.setParameter("p_sal_rng_to", job_posting_dtls.getSal_rng_to());
		query.setParameter("p_acad_qual", job_posting_dtls.getAcad_qual());
		query.setParameter("p_job_desc", job_posting_dtls.getJob_desc());
		query.setParameter("p_job_loc", job_posting_dtls.getJob_loc());
		query.setParameter("p_exp_dtls", job_posting_dtls.getExp_dtls());
		query.setParameter("p_cntct_prsn_nm", job_posting_dtls.getCntct_prsn_nm());
		query.setParameter("p_cntct_nmbr", job_posting_dtls.getCntct_nmbr());
		query.setParameter("p_cntct_eml_addrss", job_posting_dtls.getCntct_eml_addrss());
		
		String msg =   (String) query.getOutputParameterValue("rst");
		return msg;
	}

	@SuppressWarnings("unchecked")
	public List<Job_dtls_vw> listJobOpenings() {
		// TODO Auto-generated method stub
		List<Job_dtls_vw> list = sessionFactory.getCurrentSession().createQuery("from Job_dtls_vw").getResultList();
		return list;
	}
	
}
