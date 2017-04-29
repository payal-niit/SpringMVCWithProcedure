package com.ecjcoach.daoimplementation;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecjcoach.dao.Cust_Rsm_Dtls_DAO;
import com.ecjcoach.model.Cust_rsm_dtls;

@Repository
public class Cust_Rsm_Dtls_DAOImplementation implements Cust_Rsm_Dtls_DAO{

	@Autowired
	private SessionFactory sessionFactory;

	public String createResumeDetails(Cust_rsm_dtls cust_Rsm_Dtls, String username, String path) {
		
		StoredProcedureQuery query = sessionFactory.getCurrentSession().createStoredProcedureQuery("cust_rsm_dtls_prc")
				
				.registerStoredProcedureParameter("p_cust_eml_addrss", String.class,  ParameterMode.IN)
				.registerStoredProcedureParameter("p_rsm_hdline", String.class,  ParameterMode.IN)
				.registerStoredProcedureParameter("p_crrnt_loc", String.class,  ParameterMode.IN)
				.registerStoredProcedureParameter("p_prf_loc", String.class,  ParameterMode.IN)
				.registerStoredProcedureParameter("p_ov_exp", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_crrnt_ann_sal", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_key_skll", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_lng_knw", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_exp_ctc", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_rsm_file_dest", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("rst", String.class, ParameterMode.OUT);
		query.setParameter("p_cust_eml_addrss", username);
		query.setParameter("p_rsm_hdline", cust_Rsm_Dtls.getRsm_hdline());
		query.setParameter("p_crrnt_loc", cust_Rsm_Dtls.getCrrnt_loc());
		query.setParameter("p_prf_loc", cust_Rsm_Dtls.getPrf_loc());
		query.setParameter("p_ov_exp", cust_Rsm_Dtls.getOv_exp());
		query.setParameter("p_crrnt_ann_sal", cust_Rsm_Dtls.getCrrnt_ann_sal());
		query.setParameter("p_cust_key_skll", cust_Rsm_Dtls.getCust_key_skll());
		query.setParameter("p_cust_lng_knw", cust_Rsm_Dtls.getCust_lng_knw());
		query.setParameter("p_exp_ctc", cust_Rsm_Dtls.getExp_ctc());
		query.setParameter("p_rsm_file_dest", path);
		query.execute();
		String msg =   (String) query.getOutputParameterValue("rst");
		System.out.println("Resume Upload : "+msg);
		
		
		return null;
	}

	public String listResumeDetails(String username) {
		StoredProcedureQuery query = sessionFactory.getCurrentSession().createStoredProcedureQuery("cust_rsm_dtls_rec")
				.registerStoredProcedureParameter("p_cust_eml_addrss", String.class,  ParameterMode.IN)
				.registerStoredProcedureParameter("rst", String.class, ParameterMode.OUT);
				query.setParameter("p_cust_eml_addrss", username);
		String msg = (String) query.getOutputParameterValue("rst");
		
		return msg;
	}
	
	
}
