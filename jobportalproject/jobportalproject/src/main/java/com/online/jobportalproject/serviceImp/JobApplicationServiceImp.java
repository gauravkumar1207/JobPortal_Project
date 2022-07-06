package com.online.jobportalproject.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.online.jobportalproject.entities.JobApplication;
import com.online.jobportalproject.repos.JobApplicationRepo;
import com.online.jobportalproject.service.JobApplicationService;


@Component
public class JobApplicationServiceImp implements JobApplicationService{

	
	@Autowired
	JobApplicationRepo jobApplicationRepo;
	
	@Override
	public List<JobApplication> getData() {
		// TODO Auto-generated method stub
		return jobApplicationRepo.findAll();
	}

	@Override
	public void addData(JobApplication JobApp) {
		// TODO Auto-generated method stub
		jobApplicationRepo.save(JobApp);
		
	}

	@Override
	public void updateData(JobApplication JobApp) {
		// TODO Auto-generated method stub
		jobApplicationRepo.save(JobApp);
		
	}

	@Override
	public List<JobApplication> deleteData(int id) {
		// TODO Auto-generated method stub
		jobApplicationRepo.deleteById(id);
		return jobApplicationRepo.findAll() ;
	}

}
