package com.ecjcoach.dao;




import com.ecjcoach.model.Cust_prsnl_dtls;


public interface Cust_Persnl_Dtls_DAO {

	public String createCustomer(Cust_prsnl_dtls cust_persnl_dtls);
	public void updateCustomer(Cust_prsnl_dtls cust_persnl_dtls);
	
	public void updateProfileImageFlag(String username, String path);
	public String otpCheck(String otpNumber, String emailId);
	
	public String otpFlagCheck(String emailId);
	
	
	
}
