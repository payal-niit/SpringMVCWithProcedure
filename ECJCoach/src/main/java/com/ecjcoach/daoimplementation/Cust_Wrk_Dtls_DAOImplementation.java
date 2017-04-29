package com.ecjcoach.daoimplementation;

import java.security.Principal;
import java.util.List;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecjcoach.dao.Cust_Wrk_Dtls_DAO;
import com.ecjcoach.model.Cust_acad_dtls;
import com.ecjcoach.model.Cust_exp_dtls;

@Repository
public class Cust_Wrk_Dtls_DAOImplementation implements Cust_Wrk_Dtls_DAO{
	@Autowired
	SessionFactory sessionFactory;

	public String createWorkDetails(Cust_exp_dtls cust_exp_dtls, Principal p) {
		StoredProcedureQuery query = sessionFactory.getCurrentSession().createStoredProcedureQuery("cust_exp_dtls_prc")
				.registerStoredProcedureParameter("p_txid", String.class,  ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_eml_addrss", String.class,  ParameterMode.IN)
				.registerStoredProcedureParameter("p_org_nm", String.class,  ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_desg", String.class,  ParameterMode.IN)
				.registerStoredProcedureParameter("p_wrkfrm", String.class,  ParameterMode.IN)
				.registerStoredProcedureParameter("p_wrkto", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_sal", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_role", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_industry", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_fun_area", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("rst", String.class, ParameterMode.OUT);
				
		query.setParameter("p_txid", cust_exp_dtls.getTx_id());
		System.out.println("txid"+cust_exp_dtls.getTx_id());
				query.setParameter("p_cust_eml_addrss", p.getName());
				query.setParameter("p_org_nm", cust_exp_dtls.getOrg_name());
				query.setParameter("p_cust_desg", cust_exp_dtls.getCust_desg());
				query.setParameter("p_wrkfrm", cust_exp_dtls.getWrk_frm());
				query.setParameter("p_wrkto", cust_exp_dtls.getWrk_to());
				query.setParameter("p_cust_sal", cust_exp_dtls.getCust_sal());
				query.setParameter("p_cust_role", cust_exp_dtls.getCust_role());
				query.setParameter("p_cust_industry", cust_exp_dtls.getCust_industry());
				query.setParameter("p_cust_fun_area", cust_exp_dtls.getCust_fun_area());
				
				String msg =   (String) query.getOutputParameterValue("rst");
				System.out.println("User Created with code : "+msg);
				return msg;
	}
	
public List<Cust_exp_dtls> getWorkListById(String cust_id) {
		
		List<Cust_exp_dtls> list = sessionFactory.getCurrentSession().createQuery("from Cust_exp_dtls where cust_id= "+"'"+cust_id+"'").getResultList();
		
		return list;
	}

}
