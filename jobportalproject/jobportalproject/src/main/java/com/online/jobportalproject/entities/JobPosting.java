package com.online.jobportalproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JobPosting")
public class JobPosting {
	
	@Id
	private int jobid;
	private String title;
	private int workexperience;
	private String profile;
	private String location;
	private String degree;
	private int Salary;
	@ManyToOne
	private company company;
	public JobPosting() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobPosting(int jobid, String title, int workexperience, String profile, String location, String degree,
			int salary, com.online.jobportalproject.entities.company company) {
		super();
		this.jobid = jobid;
		this.title = title;
		this.workexperience = workexperience;
		this.profile = profile;
		this.location = location;
		this.degree = degree;
		Salary = salary;
		this.company = company;
	}
	public int getJobid() {
		return jobid;
	}
	public void setJobid(int jobid) {
		this.jobid = jobid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getWorkexperience() {
		return workexperience;
	}
	public void setWorkexperience(int workexperience) {
		this.workexperience = workexperience;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
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
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public company getCompany() {
		return company;
	}
	public void setCompany(company company) {
		this.company = company;
	}
}
