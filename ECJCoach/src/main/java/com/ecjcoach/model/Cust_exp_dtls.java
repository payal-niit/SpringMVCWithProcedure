package com.ecjcoach.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.google.gson.annotations.Expose;

@Entity
public class Cust_exp_dtls {
	@Id
	private String tx_id;
	private String cust_id;
	private String org_name;
	private String cust_desg;
	private String wrk_frm;
	private String wrk_to;
	private String cust_sal;
	private String cust_role;
	private String cust_industry;
	private String cust_fun_area;
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
	
	@ManyToOne
	@JoinColumn(name="cust_id", insertable=false, nullable=false, updatable=false)
	private Cust_prsnl_dtls cust_prsnl_dtls;

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

	public String getOrg_name() {
		return org_name;
	}

	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}

	public String getCust_desg() {
		return cust_desg;
	}

	public void setCust_desg(String cust_desg) {
		this.cust_desg = cust_desg;
	}

	public String getWrk_frm() {
		return wrk_frm;
	}

	public void setWrk_frm(String wrk_frm) {
		this.wrk_frm = wrk_frm;
	}

	public String getWrk_to() {
		return wrk_to;
	}

	public void setWrk_to(String wrk_to) {
		this.wrk_to = wrk_to;
	}

	public String getCust_sal() {
		return cust_sal;
	}

	public void setCust_sal(String cust_sal) {
		this.cust_sal = cust_sal;
	}

	public String getCust_role() {
		return cust_role;
	}

	public void setCust_role(String cust_role) {
		this.cust_role = cust_role;
	}

	public String getCust_industry() {
		return cust_industry;
	}

	public void setCust_industry(String cust_industry) {
		this.cust_industry = cust_industry;
	}

	public String getCust_fun_area() {
		return cust_fun_area;
	}

	public void setCust_fun_area(String cust_fun_area) {
		this.cust_fun_area = cust_fun_area;
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

	public Cust_prsnl_dtls getCust_prsnl_dtls() {
		return cust_prsnl_dtls;
	}

	public void setCust_prsnl_dtls(Cust_prsnl_dtls cust_prsnl_dtls) {
		this.cust_prsnl_dtls = cust_prsnl_dtls;
	}

}
