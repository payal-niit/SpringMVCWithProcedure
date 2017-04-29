package com.ecjcoach.daoimplementation;



import java.util.List;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ecjcoach.dao.Cust_Persnl_Dtls_DAO;
import com.ecjcoach.model.Cust_prsnl_dtls;

@Repository
public class Cust_Persnl_Dtls_DAOImplementation implements Cust_Persnl_Dtls_DAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	public String createCustomer(Cust_prsnl_dtls cust_persnl_dtls) {
	
		StoredProcedureQuery query = sessionFactory.getCurrentSession().createStoredProcedureQuery("cust_prsnl_dtls_prc")
				.registerStoredProcedureParameter("p_custid", String.class,  ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_fname", String.class,  ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_lname", String.class,  ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_gnd", Character.class,  ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_dob", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_addrss", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_eml_addrss", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_cntct_mbl", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_cntct_phn", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_city", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_state", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_pincd", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_mrtl_stts", Character.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_psswd", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_phys_chllg", Character.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_phys_chllg_rmk", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_pst_flg", Character.class, ParameterMode.IN)
				.registerStoredProcedureParameter("rst", String.class, ParameterMode.OUT);
				
		query.setParameter("p_custid", "N/A");
				query.setParameter("p_cust_fname", cust_persnl_dtls.getCust_fname());
				query.setParameter("p_cust_lname", cust_persnl_dtls.getCust_lname());
				query.setParameter("p_cust_gnd", 'U');
				query.setParameter("p_cust_dob", cust_persnl_dtls.getCust_dob());
				query.setParameter("p_cust_addrss", "N/A");
				query.setParameter("p_cust_eml_addrss", cust_persnl_dtls.getCust_eml_addrss());
				query.setParameter("p_cust_cntct_mbl", cust_persnl_dtls.getCust_cntct_mbl());
				query.setParameter("p_cust_cntct_phn", "N/A");
				query.setParameter("p_cust_city", "N/A");
				query.setParameter("p_cust_state", "N/A");
				query.setParameter("p_cust_pincd", "N/A");
				query.setParameter("p_cust_mrtl_stts", 'U');
				query.setParameter("p_cust_psswd", cust_persnl_dtls.getCust_psswd());
				query.setParameter("p_phys_chllg", 'N');
				query.setParameter("p_phys_chllg_rmk", "N/A");
				query.setParameter("p_pst_flg", 'I');
				
				String msg =   (String) query.getOutputParameterValue("rst");
				System.out.println("User Created with code : "+msg);
				return msg;
	
				
	}
	
	@SuppressWarnings("unchecked")
	public Cust_prsnl_dtls getuserByName(String username) {
		Session session = this.sessionFactory.getCurrentSession();
		List<Cust_prsnl_dtls> userList = session.createQuery("from Cust_prsnl_dtls where cust_eml_addrss =" +"'"+username+"'"+"  order by cust_id").getResultList();
		return userList.get(0);
	}
	
	
	public String gePersonByUsername(String username){
		StoredProcedureQuery query = sessionFactory.getCurrentSession().createStoredProcedureQuery("cust_prsnl_dtls_rec")
		.registerStoredProcedureParameter("p_cust_eml_addrss", String.class, ParameterMode.IN).
		setParameter("p_cust_eml_addrss", username)
		.registerStoredProcedureParameter("p_result", String.class, ParameterMode.OUT);
		String result =(String) query.getOutputParameterValue("p_result");
		
		
		
		return result;
		
		
	}

	public String otpCheck(String otpNumber, String emailId) {
		StoredProcedureQuery query = sessionFactory.getCurrentSession().createStoredProcedureQuery("cust_otp_passw_vld_prc")
				.registerStoredProcedureParameter("p_cust_eml_addrss", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_otp_val", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_rst", String.class, ParameterMode.OUT)
				.setParameter("p_cust_eml_addrss", emailId).setParameter("p_otp_val", otpNumber);
		
		String result =  query.getOutputParameterValue("p_rst").toString();
		
		return result;

	}

	public String otpFlagCheck(String emailId) {
		StoredProcedureQuery query = sessionFactory.getCurrentSession().createStoredProcedureQuery("otp_flg_stts")
				.registerStoredProcedureParameter("p_cust_eml_addrss", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_flg_stts", String.class, ParameterMode.OUT)
				.setParameter("p_cust_eml_addrss", emailId);
		String result = (String) query.getOutputParameterValue("p_flg_stts");
		
		return result;
	}

	public void updateCustomer(Cust_prsnl_dtls cust_persnl_dtls) {
		
		System.out.println(cust_persnl_dtls.getCust_id());
		StoredProcedureQuery query = sessionFactory.getCurrentSession().createStoredProcedureQuery("cust_prsnl_dtls_prc")
				.registerStoredProcedureParameter("p_custid", String.class,  ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_fname", String.class,  ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_lname", String.class,  ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_gnd", Character.class,  ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_dob", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_addrss", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_eml_addrss", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_cntct_mbl", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_cntct_phn", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_city", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_state", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_pincd", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_mrtl_stts", Character.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_cust_psswd", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_phys_chllg", Character.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_phys_chllg_rmk", String.class, ParameterMode.IN)
				.registerStoredProcedureParameter("p_pst_flg", Character.class, ParameterMode.IN)
				.registerStoredProcedureParameter("rst", String.class, ParameterMode.OUT);
				
		query.setParameter("p_custid", cust_persnl_dtls.getCust_id());
				query.setParameter("p_cust_fname", cust_persnl_dtls.getCust_fname());
				query.setParameter("p_cust_lname", cust_persnl_dtls.getCust_lname());
				query.setParameter("p_cust_gnd", cust_persnl_dtls.getCust_gnd() );
				query.setParameter("p_cust_dob", cust_persnl_dtls.getCust_dob());
				query.setParameter("p_cust_addrss", cust_persnl_dtls.getCust_addrss());
				query.setParameter("p_cust_eml_addrss", "N/A");
				query.setParameter("p_cust_cntct_mbl", "N/A");
				query.setParameter("p_cust_cntct_phn", cust_persnl_dtls.getCust_cntct_phn());
				query.setParameter("p_cust_city", cust_persnl_dtls.getCust_city());
				query.setParameter("p_cust_state", cust_persnl_dtls.getCust_state());
				query.setParameter("p_cust_pincd", cust_persnl_dtls.getCust_pincd());
				query.setParameter("p_cust_mrtl_stts", cust_persnl_dtls.getCust_mrtl_stts());
				query.setParameter("p_cust_psswd", "N/A");
				query.setParameter("p_phys_chllg", cust_persnl_dtls.getPhys_chllg());
				query.setParameter("p_phys_chllg_rmk", cust_persnl_dtls.getPhys_chllg_rmk());
				query.setParameter("p_pst_flg", 'U');
				
				String msg =   (String) query.getOutputParameterValue("rst");
		System.out.println("User updated with code : "+msg);
	}



	public void updateProfileImageFlag(String username, String path) {
		StoredProcedureQuery query = sessionFactory.getCurrentSession().createStoredProcedureQuery("cust_prsnl_img_prc")
		.registerStoredProcedureParameter("p_cust_eml_addrss", String.class,  ParameterMode.IN)
		.registerStoredProcedureParameter("p_img_file_dest", String.class,  ParameterMode.IN);
		query.setParameter("p_cust_eml_addrss", username);
		query.setParameter("p_img_file_dest", path);
		query.execute();
	}
	
	@SuppressWarnings("unchecked")
	public Cust_prsnl_dtls getIdByName(String cust_eml_addrss) {
		List<Cust_prsnl_dtls> list=sessionFactory.getCurrentSession().createQuery("from Cust_prsnl_dtls where cust_eml_addrss = "+"'"+ cust_eml_addrss + "'").getResultList();
		return list.get(0);
	}
	
	
	
	
	
}
