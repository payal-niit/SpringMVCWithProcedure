package com.ecjcoach.model;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;


import org.springframework.web.multipart.MultipartFile;

import com.google.gson.annotations.Expose;

@Entity
public class Cust_prsnl_dtls {

	@Id
	@Column(length=25)
	@Expose
	private String cust_id;
	@Column(length=100)
	@Expose
	private String cust_fname;
	
	@Transient
	private MultipartFile prf_image;
	@Column(length=100)
	@Expose
	private String cust_lname; //varchar(100) not null,
	@Expose
	private char cust_gnd; //varchar(1) check(cust_gnd in('M','F','T','U')),
	@Expose
	private String cust_dob; //date,
	@Column(length=8000)
	@Expose
	private String cust_addrss; // varchar(8000),
	@Column(length=50)
	@Expose
	private String cust_eml_addrss; //varchar(50) not null,
	@Column(length=10)
	@Expose
	private String cust_cntct_mbl; //numeric(10); //not null,
	@Column(length=15)
	@Expose
	private String cust_cntct_phn; //varchar(15),
	@Column(length=100)
	@Expose
	private String cust_city; //varchar(100) ,
	@Column(length=100)
	@Expose
	private String cust_state; //varchar(100),
	@Column(length=10)
	@Expose
	private String cust_pincd; //varchar(10) ,
	@Expose
	private char cust_mrtl_stts; //varchar(1),check (cust_mrtl_stts in('S','M','D','U')),
	@Column(length=500)
	@Expose
	private String cust_psswd; //varbinary(500) ,
	@Expose
	private char phys_chllg; //varchar(1),check(phys_chllg in('Y','N')),
	@Column(length=300)
	@Expose
	private String phys_chllg_rmk; //varchar(300),
	@Column(length=300)
	@Expose
	private String img_file_dest; //varchar(300),
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
	@Expose
	private char otp_flg;
	
	
	public MultipartFile getPrf_image() {
		return prf_image;
	}
	public void setPrf_image(MultipartFile prf_image) {
		this.prf_image = prf_image;
	}
	public char getOtp_flg() {
		return otp_flg;
	}
	public void setOtp_flg(char otp_flg) {
		this.otp_flg = otp_flg;
	}
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_fname() {
		return cust_fname;
	}
	public void setCust_fname(String cust_fname) {
		this.cust_fname = cust_fname;
	}
	public String getCust_lname() {
		return cust_lname;
	}
	public void setCust_lname(String cust_lname) {
		this.cust_lname = cust_lname;
	}
	public char getCust_gnd() {
		return cust_gnd;
	}
	public void setCust_gnd(char cust_gnd) {
		this.cust_gnd = cust_gnd;
	}
	public String getCust_dob() {
		return cust_dob;
	}
	public void setCust_dob(String cust_dob) {
		this.cust_dob = cust_dob;
	}
	public String getCust_addrss() {
		return cust_addrss;
	}
	public void setCust_addrss(String cust_addrss) {
		this.cust_addrss = cust_addrss;
	}
	public String getCust_eml_addrss() {
		return cust_eml_addrss;
	}
	public void setCust_eml_addrss(String cust_eml_addrss) {
		this.cust_eml_addrss = cust_eml_addrss;
	}
	public String getCust_cntct_mbl() {
		return cust_cntct_mbl;
	}
	public void setCust_cntct_mbl(String cust_cntct_mbl) {
		this.cust_cntct_mbl = cust_cntct_mbl;
	}
	public String getCust_cntct_phn() {
		return cust_cntct_phn;
	}
	public void setCust_cntct_phn(String cust_cntct_phn) {
		this.cust_cntct_phn = cust_cntct_phn;
	}
	public String getCust_city() {
		return cust_city;
	}
	public void setCust_city(String cust_city) {
		this.cust_city = cust_city;
	}
	public String getCust_state() {
		return cust_state;
	}
	public void setCust_state(String cust_state) {
		this.cust_state = cust_state;
	}
	public String getCust_pincd() {
		return cust_pincd;
	}
	public void setCust_pincd(String cust_pincd) {
		this.cust_pincd = cust_pincd;
	}
	public char getCust_mrtl_stts() {
		return cust_mrtl_stts;
	}
	public void setCust_mrtl_stts(char cust_mrtl_stts) {
		this.cust_mrtl_stts = cust_mrtl_stts;
	}
	public String getCust_psswd() {
		return cust_psswd;
	}
	public void setCust_psswd(String cust_psswd) {
		this.cust_psswd = cust_psswd;
	}
	public char getPhys_chllg() {
		return phys_chllg;
	}
	public void setPhys_chllg(char phys_chllg) {
		this.phys_chllg = phys_chllg;
	}
	public String getPhys_chllg_rmk() {
		return phys_chllg_rmk;
	}
	public void setPhys_chllg_rmk(String phys_chllg_rmk) {
		this.phys_chllg_rmk = phys_chllg_rmk;
	}
	public String getImg_file_dest() {
		return img_file_dest;
	}
	public void setImg_file_dest(String img_file_dest) {
		this.img_file_dest = img_file_dest;
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
