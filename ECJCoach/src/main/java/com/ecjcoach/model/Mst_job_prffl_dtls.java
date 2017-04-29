package com.ecjcoach.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.google.gson.annotations.Expose;

@Entity
public class Mst_job_prffl_dtls {

	@Id
	@Expose
	@Column(length=25)
	private String job_prffl_id;
	@Expose
	@Column(length=25)
	private String job_cat_id;
	@Expose
	private String job_industry_prffl;
	
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
	
	@ManyToOne
	@JoinColumn(name="job_cat_id", insertable=false, nullable=false, updatable=false)
	private Mst_job_cat_dtls mst_job_cat_dtls;

	public String getJob_prffl_id() {
		return job_prffl_id;
	}
	
	@Expose
	@OneToMany(mappedBy="mst_job_prffl_dtls", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Job_posting_dtls> job_posting_dtls;
	
	

	public Set<Job_posting_dtls> getJob_posting_dtls() {
		return job_posting_dtls;
	}

	public void setJob_posting_dtls(Set<Job_posting_dtls> job_posting_dtls) {
		this.job_posting_dtls = job_posting_dtls;
	}

	public void setJob_prffl_id(String job_prffl_id) {
		this.job_prffl_id = job_prffl_id;
	}

	public String getJob_cat_id() {
		return job_cat_id;
	}

	public void setJob_cat_id(String job_cat_id) {
		this.job_cat_id = job_cat_id;
	}

	public String getJob_industry_prffl() {
		return job_industry_prffl;
	}

	public void setJob_industry_prffl(String job_industry_prffl) {
		this.job_industry_prffl = job_industry_prffl;
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

	public Mst_job_cat_dtls getMst_job_cat_dtls() {
		return mst_job_cat_dtls;
	}

	public void setMst_job_cat_dtls(Mst_job_cat_dtls mst_job_cat_dtls) {
		this.mst_job_cat_dtls = mst_job_cat_dtls;
	}
	
	
	
}
