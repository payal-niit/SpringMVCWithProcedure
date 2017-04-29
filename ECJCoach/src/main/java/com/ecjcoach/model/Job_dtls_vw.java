package com.ecjcoach.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.google.gson.annotations.Expose;

@Entity
public class Job_dtls_vw {
	
	@Id
	@Column(length=25)
	@Expose
	private String job_post_id;
	@Expose
	private String skll_req;
	@Expose
	private String sal_rng_frm;
	@Expose
	private String sal_rng_to;
	@Expose
	private String job_desc;
	@Expose
	private String acad_qual;
	@Expose
	private String job_loc;
	@Expose
	private String exp_dtls;
	@Expose
	private String cntct_prsn_nm;
	@Expose
	private String cntct_eml_addrss;
	@Expose
	private String cntct_nmbr;
	@Expose
	private String job_industry_prffl;
	@Expose
	private String job_industry;
	@Expose
	private String cmpny_nm;
	public String getJob_post_id() {
		return job_post_id;
	}
	public void setJob_post_id(String job_post_id) {
		this.job_post_id = job_post_id;
	}
	public String getSkll_req() {
		return skll_req;
	}
	public void setSkll_req(String skll_req) {
		this.skll_req = skll_req;
	}
	public String getSal_rng_frm() {
		return sal_rng_frm;
	}
	public void setSal_rng_frm(String sal_rng_frm) {
		this.sal_rng_frm = sal_rng_frm;
	}
	public String getSal_rng_to() {
		return sal_rng_to;
	}
	public void setSal_rng_to(String sal_rng_to) {
		this.sal_rng_to = sal_rng_to;
	}
	public String getJob_desc() {
		return job_desc;
	}
	public void setJob_desc(String job_desc) {
		this.job_desc = job_desc;
	}
	public String getAcad_qual() {
		return acad_qual;
	}
	public void setAcad_qual(String acad_qual) {
		this.acad_qual = acad_qual;
	}
	public String getJob_loc() {
		return job_loc;
	}
	public void setJob_loc(String job_loc) {
		this.job_loc = job_loc;
	}
	public String getExp_dtls() {
		return exp_dtls;
	}
	public void setExp_dtls(String exp_dtls) {
		this.exp_dtls = exp_dtls;
	}
	public String getCntct_prsn_nm() {
		return cntct_prsn_nm;
	}
	public void setCntct_prsn_nm(String cntct_prsn_nm) {
		this.cntct_prsn_nm = cntct_prsn_nm;
	}
	public String getCntct_eml_addrss() {
		return cntct_eml_addrss;
	}
	public void setCntct_eml_addrss(String cntct_eml_addrss) {
		this.cntct_eml_addrss = cntct_eml_addrss;
	}
	public String getCntct_nmbr() {
		return cntct_nmbr;
	}
	public void setCntct_nmbr(String cntct_nmbr) {
		this.cntct_nmbr = cntct_nmbr;
	}
	public String getJob_industry_prffl() {
		return job_industry_prffl;
	}
	public void setJob_industry_prffl(String job_industry_prffl) {
		this.job_industry_prffl = job_industry_prffl;
	}
	public String getJob_industry() {
		return job_industry;
	}
	public void setJob_industry(String job_industry) {
		this.job_industry = job_industry;
	}
	public String getCmpny_nm() {
		return cmpny_nm;
	}
	public void setCmpny_nm(String cmpny_nm) {
		this.cmpny_nm = cmpny_nm;
	}
	
	

}
