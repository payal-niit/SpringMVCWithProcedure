package com.ecjcoach.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Cust_dtls_vw {
	@Id
	private int cust_id;
	private String cust_eml_addrss;
	private String cust_psswd;
	private char use_flg;
	private String role_nm;
	
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_eml_addrss() {
		return cust_eml_addrss;
	}
	public void setCust_eml_addrss(String cust_eml_addrss) {
		this.cust_eml_addrss = cust_eml_addrss;
	}
	public String getCust_psswd() {
		return cust_psswd;
	}
	public void setCust_psswd(String cust_psswd) {
		this.cust_psswd = cust_psswd;
	}
	public char getUse_flg() {
		return use_flg;
	}
	public void setUse_flg(char use_flg) {
		this.use_flg = use_flg;
	}
	public String getRole_nm() {
		return role_nm;
	}
	public void setRole_nm(String role_nm) {
		this.role_nm = role_nm;
	}
	
	
}
