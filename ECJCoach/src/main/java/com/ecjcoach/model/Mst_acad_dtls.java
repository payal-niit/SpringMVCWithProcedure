package com.ecjcoach.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mst_acad_dtls {

	@Id
	private String acad_id;
	private String acad_nm;
	private Date created_dt;
	private Date modified_dt;
	private String usr_chng;
	private char pst_flg;
	private int nmbr_chng;
	private char use_flg;
	
	
	
	public String getAcad_id() {
		return acad_id;
	}
	public void setAcad_id(String acad_id) {
		this.acad_id = acad_id;
	}
	public String getAcad_nm() {
		return acad_nm;
	}
	public void setAcad_nm(String acad_nm) {
		this.acad_nm = acad_nm;
	}
	public Date getCreated_dt() {
		return created_dt;
	}
	public void setCreated_dt(Date created_dt) {
		this.created_dt = created_dt;
	}
	public Date getModified_dt() {
		return modified_dt;
	}
	public void setModified_dt(Date modified_dt) {
		this.modified_dt = modified_dt;
	}
	public String getUsr_chng() {
		return usr_chng;
	}
	public void setUsr_chng(String usr_chng) {
		this.usr_chng = usr_chng;
	}
	public char getPst_flg() {
		return pst_flg;
	}
	public void setPst_flg(char pst_flg) {
		this.pst_flg = pst_flg;
	}
	
	public char getUse_flg() {
		return use_flg;
	}
	public void setUse_flg(char use_flg) {
		this.use_flg = use_flg;
	}
	public int getNmbr_chng() {
		return nmbr_chng;
	}
	public void setNmbr_chng(int nmbr_chng) {
		this.nmbr_chng = nmbr_chng;
	}
	
	
	
	
}
