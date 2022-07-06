package com.online.jobportalproject.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.online.jobportalproject.entities.JobApplication;

@Service
public interface JobApplicationService {
	
	public List<JobApplication> getData();
	
	public void addData(JobApplication JobApp);
	
	public void updateData(@RequestBody JobApplication JobApp);
	
	public List<JobApplication> deleteData(@PathVariable("id") int id);

}