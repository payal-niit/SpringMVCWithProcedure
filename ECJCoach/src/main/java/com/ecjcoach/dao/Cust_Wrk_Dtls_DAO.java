package com.ecjcoach.dao;

import java.security.Principal;


import com.ecjcoach.model.Cust_exp_dtls;

public interface Cust_Wrk_Dtls_DAO {
	
	public String createWorkDetails(Cust_exp_dtls cust_exp_dtls,Principal p);

}
