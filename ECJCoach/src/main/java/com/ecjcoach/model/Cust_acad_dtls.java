package com.ecjcoach.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import com.google.gson.annotations.Expose;

@Entity
public class Cust_acad_dtls {
	
	
	@Id
	@Expose
	private String tx_id;
	@Expose
	private String cust_id;
	@Expose
	private String acad_id;
	
	@ManyToOne
	@JoinColumn(name="cust_id", insertable=false, nullable=false, updatable=false)
	private Cust_prsnl_dtls cust_prsnl_dtls;
	
	@ManyToOne
	@JoinColumn(name="acad_id", insertable=false, nullable=false, updatable=false)
	private Mst_acad_dtls mst_acad_dtls;
	
	
	
	@Expose
	private String acad_yr;
	@Expose
	private String acad_mrk_per;
	@Expose
	private String acad_spz;
	@Expose
	private String acad_inst;
	@Expose
	private Date created_dt; //datetime,
	@Expose
	private Date modified_dt; //datetime,
	@Column(length=500)
	@Expose
	private String usr_chng; //varchar(500) not null,
	@Expose
	private char pst_flg; //varchar(1) not null,
	@Column(length=15)
	@Expose
	private int nmbr_chng; //numeric(15) not null,
	@Expose
	private char use_flg; //varchar(1) , check (use_flg in('Y','N','X','P')),
	
	private String cust_acad_othr_desc;
	
	public String getCust_acad_othr_desc() {
		return cust_acad_othr_desc;
	}
	public void setCust_acad_othr_desc(String cust_acad_othr_desc) {
		this.cust_acad_othr_desc = cust_acad_othr_desc;
	}
	public Cust_prsnl_dtls getCust_prsnl_dtls() {
		return cust_prsnl_dtls;
	}
	public void setCust_prsnl_dtls(Cust_prsnl_dtls cust_prsnl_dtls) {
		this.cust_prsnl_dtls = cust_prsnl_dtls;
	}
	public Mst_acad_dtls getMst_acad_dtls() {
		return mst_acad_dtls;
	}
	public void setMst_acad_dtls(Mst_acad_dtls mst_acad_dtls) {
		this.mst_acad_dtls = mst_acad_dtls;
	}
	public String getTx_id() {
		return tx_id;
	}
	public void setTx_id(String tx_id) {
		this.tx_id = tx_id;
	}
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	public String getAcad_id() {
		return acad_id;
	}
	public void setAcad_id(String acad_id) {
		this.acad_id = acad_id;
	}
	public String getAcad_yr() {
		return acad_yr;
	}
	public void setAcad_yr(String acad_yr) {
		this.acad_yr = acad_yr;
	}
	public String getAcad_mrk_per() {
		return acad_mrk_per;
	}
	public void setAcad_mrk_per(String acad_mrk_per) {
		this.acad_mrk_per = acad_mrk_per;
	}
	public String getAcad_spz() {
		return acad_spz;
	}
	public void setAcad_spz(String acad_spz) {
		this.acad_spz = acad_spz;
	}
	
	public String getAcad_inst() {
		return acad_inst;
	}
	public void setAcad_inst(String acad_inst) {
		this.acad_inst = acad_inst;
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
	public int getNmbr_chng() {
		return nmbr_chng;
	}
	public void setNmbr_chng(int nmbr_chng) {
		this.nmbr_chng = nmbr_chng;
	}
	public char getUse_flg() {
		return use_flg;
	}
	public void setUse_flg(char use_flg) {
		this.use_flg = use_flg;
	}

}
