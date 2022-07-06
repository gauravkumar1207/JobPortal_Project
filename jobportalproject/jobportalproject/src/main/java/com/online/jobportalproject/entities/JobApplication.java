package com.online.jobportalproject.entities;


import javax.persistence.Entity;




import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="JobApplication")
public class JobApplication {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Application_id;
	private String StateofJob;
	@ManyToOne
	private JobPosting jobPosting;
	//@ManyToOne
	//private Jobseeker jobSeeker;
	public JobApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobApplication(int application_id, String stateofJob, JobPosting jobPosting, Jobseeker jobSeeker) {
		super();
		Application_id = application_id;
		StateofJob = stateofJob;
		this.jobPosting = jobPosting;
		//this.jobSeeker = jobSeeker;
	}
	public int getApplication_id() {
		return Application_id;
	}
	public void setApplication_id(int application_id) {
		Application_id = application_id;
	}
	public String getStateofJob() {
		return StateofJob;
	}
	public void setStateofJob(String stateofJob) {
		StateofJob = stateofJob;
	}
	public JobPosting getJobPosting() {
		return jobPosting;
	}
	public void setJobPosting(JobPosting jobPosting) {
		this.jobPosting = jobPosting;
	}
//	public Jobseeker getJobSeeker() {
//		return jobSeeker;
//	}
//	public void setJobSeeker(Jobseeker jobSeeker) {
//		this.jobSeeker = jobSeeker;
//	}
//	
}