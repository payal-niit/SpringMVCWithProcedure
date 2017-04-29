package com.ecjcoach.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.google.gson.annotations.Expose;

@Entity
public class Cust_role_dtls {
	
	@Id
	@Expose
	@Column(length=25)
	private String cust_id;
	@Expose
	@Column(length=25)
	private String role_id;
	
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
	
	@OneToOne
	@JoinColumn(name="role_id", insertable=false, nullable=false, updatable=false)
	private Mst_role mst_role;
	
	@OneToOne
	@JoinColumn(name="cust_id", insertable=false, nullable=false, updatable=false)
	private Cust_prsnl_dtls cust_prsnl_dtls;

	public String getCust_id() {
		return cust_id;
	}

	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}

	public String getRole_id() {
		return role_id;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
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

	public Mst_role getMst_role() {
		return mst_role;
	}

	public void setMst_role(Mst_role mst_role) {
		this.mst_role = mst_role;
	}

	public Cust_prsnl_dtls getCust_prsnl_dtls() {
		return cust_prsnl_dtls;
	}

	public void setCust_prsnl_dtls(Cust_prsnl_dtls cust_prsnl_dtls) {
		this.cust_prsnl_dtls = cust_prsnl_dtls;
	}
	
	
	
}
