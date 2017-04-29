package com.ecjcoach.service;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecjcoach.daoimplementation.Cust_Acad_Dtls_DAOImplementation;
import com.ecjcoach.model.Cust_acad_dtls;
import com.ecjcoach.model.Mst_acad_dtls;

@Service
public class Cust_Acad_Dtls_Service {
	
	@Autowired
	Cust_Acad_Dtls_DAOImplementation cust_Acad_Dtls_Dao_Implementation;
	
	@Transactional
	public String createAcadDetails(Cust_acad_dtls cust_acad_dtls,Principal p) {
	
		return cust_Acad_Dtls_Dao_Implementation.createAcadDetails(cust_acad_dtls, p);
	}
	
	@Transactional
	public List<Mst_acad_dtls> listMstDtls()
	{
		return cust_Acad_Dtls_Dao_Implementation.listMstDtls();
	}
	@Transactional
	public List<Cust_acad_dtls> getAcadListById(String cust_id) {
		return cust_Acad_Dtls_Dao_Implementation.getAcadListById(cust_id);
	}

}
