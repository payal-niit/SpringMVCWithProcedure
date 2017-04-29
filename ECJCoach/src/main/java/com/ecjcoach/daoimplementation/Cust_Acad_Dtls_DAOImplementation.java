package com.ecjcoach.daoimplementation;

import java.security.Principal;
import java.util.List;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecjcoach.dao.Cust_Acad_Dtls_DAO;
import com.ecjcoach.model.Cust_acad_dtls;
import com.ecjcoach.model.Mst_acad_dtls;


@Repository
public class Cust_Acad_Dtls_DAOImplementation implements Cust_Acad_Dtls_DAO{

	@Autowired
	private SessionFactory sessionFactory;

	public String createAcadDetails(Cust_acad_dtls cust_acad_dtls,Principal p) {
		
		
		StoredProcedureQuery query = sessionFactory.getCurrentSession().createStoredProcedureQuery("cust_acad_dtls_prc")
				.registerStoredProcedureParameter("p_txid", String.class,  ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_eml_addrss", String.class,  ParameterMode.IN)
				.registerStoredProcedureParameter("p_acad_id", String.class,  ParameterMode.IN)
				.registerStoredProcedureParameter("p_acad_yr", String.class,  ParameterMode.IN)
				.registerStoredProcedureParameter("p_acad_mrk_per", String.class,  ParameterMode.IN)
				.registerStoredProcedureParameter("p_acad_spz", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_acad_inst", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_acad_othr_desc", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("rst", String.class, ParameterMode.OUT);
				
		query.setParameter("p_txid", cust_acad_dtls.getTx_id());
		System.out.println("txid"+cust_acad_dtls.getTx_id());
				query.setParameter("p_cust_eml_addrss", p.getName());
				query.setParameter("p_acad_id", cust_acad_dtls.getAcad_id());
				query.setParameter("p_acad_yr", cust_acad_dtls.getAcad_yr());
				query.setParameter("p_acad_mrk_per", cust_acad_dtls.getAcad_mrk_per());
				query.setParameter("p_acad_spz", cust_acad_dtls.getAcad_spz());
				query.setParameter("p_acad_inst", cust_acad_dtls.getAcad_inst());
				query.setParameter("p_acad_othr_desc", cust_acad_dtls.getCust_acad_othr_desc());
				
				String msg =   (String) query.getOutputParameterValue("rst");
				System.out.println("User Created with code : "+msg);
				return msg;
			
	}

	@SuppressWarnings("unchecked")
	public List<Mst_acad_dtls> listMstDtls() {
		List<Mst_acad_dtls> list = sessionFactory.getCurrentSession().createQuery("from Mst_acad_dtls").getResultList();
		
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public List<Cust_acad_dtls> getAcadListById(String cust_id) {
		
		List<Cust_acad_dtls> list = sessionFactory.getCurrentSession().createQuery("from Cust_acad_dtls where cust_id= "+"'"+cust_id+"'").getResultList();
		
		return list;
	}
	
 
}
