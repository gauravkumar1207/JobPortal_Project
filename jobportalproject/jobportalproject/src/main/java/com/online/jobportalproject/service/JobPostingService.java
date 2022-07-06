package com.online.jobportalproject.service;

import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.online.jobportalproject.entities.JobPosting;


@Service
public interface JobPostingService {
	
	public List<JobPosting> getData();
	
	public void addData(JobPosting JobPost);
	
	public void updateData(@RequestBody JobPosting JobPost);
	
	public List<JobPosting> deleteData(@PathVariable("id") int id);

	public List<JobPosting> viewJobs();

	public List<JobPosting> viewJobbyloc(String location);

	public List<JobPosting> viewJobsbyExp(int workexperience);

	public List<JobPosting> viewJobsbydegree(String degree);
	
	public List<JobPosting> changeorder(String profile);

}
