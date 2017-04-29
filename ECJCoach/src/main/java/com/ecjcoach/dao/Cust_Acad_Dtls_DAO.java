package com.ecjcoach.dao;

import java.security.Principal;
import java.util.List;

import com.ecjcoach.model.Cust_acad_dtls;
import com.ecjcoach.model.Mst_acad_dtls;

public interface Cust_Acad_Dtls_DAO {

	public String createAcadDetails(Cust_acad_dtls cust_acad_dtls,Principal p);
	public List<Mst_acad_dtls> listMstDtls();
	
	
}
