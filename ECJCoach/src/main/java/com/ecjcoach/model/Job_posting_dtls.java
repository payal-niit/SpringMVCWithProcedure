package com.ecjcoach.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.google.gson.annotations.Expose;

@Entity
public class Job_posting_dtls {

	@Id
	@Column(length=25)
	@Expose
	private String job_post_id;
	@Column(length=25)
	@Expose
	private String cmpny_id;
	@Column(length=25)
	@Expose
	private String job_cat_id;
	@Column(length=25)
	@Expose
	private String job_prffl_id;
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
	private Date created_dt;
	@Expose
	private Date modified_dt;
	@Expose
	private String usr_chng;
	@Expose
	private char pst_flg;
	@Expose
	private int nmbr_chng;
	@Expose
	private char use_flg;
	
	@ManyToOne
	@JoinColumn(name="cmpny_id", nullable=false, insertable=false, updatable=false)
	Mst_cmpny_dtls mst_cmpny_dtls;
	
	@ManyToOne
	@JoinColumn(name="job_cat_id", nullable=false, insertable=false, updatable=false)
	Mst_job_cat_dtls mst_job_cat_dtls;
	
	@ManyToOne
	@JoinColumn(name="job_prffl_id", nullable=false, insertable=false, updatable=false)
	Mst_job_prffl_dtls mst_job_prffl_dtls;

	public String getJob_post_id() {
		return job_post_id;
	}

	public void setJob_post_id(String job_post_id) {
		this.job_post_id = job_post_id;
	}

	public String getCmpny_id() {
		return cmpny_id;
	}

	public void setCmpny_id(String cmpny_id) {
		this.cmpny_id = cmpny_id;
	}

	public String getJob_cat_id() {
		return job_cat_id;
	}

	public void setJob_cat_id(String job_cat_id) {
		this.job_cat_id = job_cat_id;
	}

	public String getJob_prffl_id() {
		return job_prffl_id;
	}

	public void setJob_prffl_id(String job_prffl_id) {
		this.job_prffl_id = job_prffl_id;
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

	public Mst_cmpny_dtls getMst_cmpny_dtls() {
		return mst_cmpny_dtls;
	}

	public void setMst_cmpny_dtls(Mst_cmpny_dtls mst_cmpny_dtls) {
		this.mst_cmpny_dtls = mst_cmpny_dtls;
	}

	public Mst_job_cat_dtls getMst_job_cat_dtls() {
		return mst_job_cat_dtls;
	}

	public void setMst_job_cat_dtls(Mst_job_cat_dtls mst_job_cat_dtls) {
		this.mst_job_cat_dtls = mst_job_cat_dtls;
	}

	public Mst_job_prffl_dtls getMst_job_prffl_dtls() {
		return mst_job_prffl_dtls;
	}

	public void setMst_job_prffl_dtls(Mst_job_prffl_dtls mst_job_prffl_dtls) {
		this.mst_job_prffl_dtls = mst_job_prffl_dtls;
	}
	
	
}
