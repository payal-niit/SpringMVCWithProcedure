package com.ecjcoach.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import com.google.gson.annotations.Expose;

@Entity
public class Cust_rsm_dtls {

	@Id
	@Expose
	private int tx_id;
	@Expose
	private String cust_id;
	@Expose
	private String rsm_hdline;
	@Expose
	private String crrnt_loc;
	@Expose
	private String prf_loc;
	@Expose
	private String ov_exp;
	@Expose
	private String crrnt_ann_sal;
	@Expose
	private String cust_key_skll;
	@Expose
	private String cust_lng_knw;
	@Expose 
	private String exp_ctc;
	@Expose
	private String rsm_file_dest;
	
	@Transient
	private MultipartFile rsm_doc;
	
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
	@JoinColumn(name="cust_id", insertable=false, nullable=false, updatable=false)
	private Cust_prsnl_dtls cust_prsnl_dtls;

	
	public String getRsm_hdline() {
		return rsm_hdline;
	}

	public void setRsm_hdline(String rsm_hdline) {
		this.rsm_hdline = rsm_hdline;
	}

	public String getCrrnt_loc() {
		return crrnt_loc;
	}

	public void setCrrnt_loc(String crrnt_loc) {
		this.crrnt_loc = crrnt_loc;
	}

	public String getPrf_loc() {
		return prf_loc;
	}

	public void setPrf_loc(String prf_loc) {
		this.prf_loc = prf_loc;
	}

	public String getOv_exp() {
		return ov_exp;
	}

	public void setOv_exp(String ov_exp) {
		this.ov_exp = ov_exp;
	}

	public String getCrrnt_ann_sal() {
		return crrnt_ann_sal;
	}

	public void setCrrnt_ann_sal(String crrnt_ann_sal) {
		this.crrnt_ann_sal = crrnt_ann_sal;
	}

	public String getCust_key_skll() {
		return cust_key_skll;
	}

	public void setCust_key_skll(String cust_key_skll) {
		this.cust_key_skll = cust_key_skll;
	}

	public String getCust_lng_knw() {
		return cust_lng_knw;
	}

	public void setCust_lng_knw(String cust_lng_knw) {
		this.cust_lng_knw = cust_lng_knw;
	}

	public String getExp_ctc() {
		return exp_ctc;
	}

	public void setExp_ctc(String exp_ctc) {
		this.exp_ctc = exp_ctc;
	}

	public String getRsm_file_dest() {
		return rsm_file_dest;
	}

	public void setRsm_file_dest(String rsm_file_dest) {
		this.rsm_file_dest = rsm_file_dest;
	}

	public MultipartFile getRsm_doc() {
		return rsm_doc;
	}

	public void setRsm_doc(MultipartFile rsm_doc) {
		this.rsm_doc = rsm_doc;
	}

	public int getTx_id() {
		return tx_id;
	}

	public void setTx_id(int tx_id) {
		this.tx_id = tx_id;
	}

	public String getCust_id() {
		return cust_id;
	}

	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
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
