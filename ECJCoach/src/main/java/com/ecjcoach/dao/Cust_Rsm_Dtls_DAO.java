package com.ecjcoach.dao;

import com.ecjcoach.model.Cust_rsm_dtls;

public interface Cust_Rsm_Dtls_DAO {

	public String createResumeDetails(Cust_rsm_dtls cust_Rsm_Dtls, String username, String path);
	public String listResumeDetails(String username);
}
