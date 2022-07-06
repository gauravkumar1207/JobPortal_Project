package com.online.jobportalproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Company")
public class company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int company_id;
	private String company_name;
	private String company_headquarter;
	private String company_description;
	private boolean verified;
	private int company_verificationcode;
	public company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public company(int company_id, String company_name, String company_headquarter, String company_description,
			boolean verified, int company_verificationcode) {
		super();
		this.company_id = company_id;
		this.company_name = company_name;
		this.company_headquarter = company_headquarter;
		this.company_description = company_description;
		this.verified = verified;
		this.company_verificationcode = company_verificationcode;
	}
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getCompany_headquarter() {
		return company_headquarter;
	}
	public void setCompany_headquarter(String company_headquarter) {
		this.company_headquarter = company_headquarter;
	}
	public String getCompany_description() {
		return company_description;
	}
	public void setCompany_description(String company_description) {
		this.company_description = company_description;
	}
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}
	public int getCompany_verificationcode() {
		return company_verificationcode;
	}
	public void setCompany_verificationcode(int company_verificationcode) {
		this.company_verificationcode = company_verificationcode;
	}
	
	
}