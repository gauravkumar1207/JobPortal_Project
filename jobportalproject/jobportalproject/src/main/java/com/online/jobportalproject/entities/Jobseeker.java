package com.online.jobportalproject.entities;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name ="JobSeeker")
public class Jobseeker {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstname;
	private String lastname;
	private String emailid;
	private int workexperience;
	private String location;
	private String degree;
	private String highest_Education;
	private boolean verified;
	private int verification_code;
	@ManyToMany
	private List<JobPosting> jobPostings;

	

	public Jobseeker() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Jobseeker(int id, String firstname, String lastname, String emailid, int workexperience, String location,
			String degree, String highest_Education, boolean verified, int verification_code,
			List<JobPosting> jobPostings) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.workexperience = workexperience;
		this.location = location;
		this.degree = degree;
		this.highest_Education = highest_Education;
		this.verified = verified;
		this.verification_code = verification_code;
		this.jobPostings = jobPostings;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getEmailid() {
		return emailid;
	}



	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}



	public int getWorkexperience() {
		return workexperience;
	}



	public void setWorkexperience(int workexperience) {
		this.workexperience = workexperience;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public String getDegree() {
		return degree;
	}



	public void setDegree(String degree) {
		this.degree = degree;
	}



	public String getHighest_Education() {
		return highest_Education;
	}



	public void setHighest_Education(String highest_Education) {
		this.highest_Education = highest_Education;
	}



	public boolean isVerified() {
		return verified;
	}



	public void setVerified(boolean verified) {
		this.verified = verified;
	}



	public int getVerification_code() {
		return verification_code;
	}



	public void setVerification_code(int verification_code) {
		this.verification_code = verification_code;
	}


	public List<JobPosting> getJobPostings() {
		return jobPostings;
	}



	public void setJobPostings(List<JobPosting> jobPostings) {
		this.jobPostings = jobPostings;
	}


}