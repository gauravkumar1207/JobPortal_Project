package com.online.jobportalproject.serviceImp;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.online.jobportalproject.entities.JobPosting;
import com.online.jobportalproject.repos.JobPostingRepo;
import com.online.jobportalproject.repos.JobseekerRepo;
import com.online.jobportalproject.service.JobPostingService;



@Component
public class JobPostingServiceImp implements JobPostingService {
	
	@Autowired
	JobPostingRepo jobPostingRepo;
	
	@Autowired
	JobseekerRepo jobseekerRepo;

	@Override
	public List<JobPosting> getData() {
		// TODO Auto-generated method stub
		return jobPostingRepo.findAll();
	}

	@Override
	public void addData(JobPosting JobPost) {
		// TODO Auto-generated method stub
		jobPostingRepo.save(JobPost);
		
	}

	@Override
	public void updateData(JobPosting JobPost) {
		// TODO Auto-generated method stub
		jobPostingRepo.save(JobPost);
		
	}

	@Override
	public List<JobPosting> deleteData(int id) {
		// TODO Auto-generated method stub
		jobPostingRepo.deleteById(id);
		return jobPostingRepo.findAll();
	}

	@Override
	public List<JobPosting> viewJobs() {
		// TODO Auto-generated method stub
		return jobPostingRepo.findAll() ;
	}
	@Override
	public List<JobPosting> viewJobbyloc(String location) {
		return jobPostingRepo.findBylocation(location);
	}

	@Override
	public List<JobPosting> viewJobsbyExp(int workexperience) {
		// TODO Auto-generated method stub
		return jobPostingRepo.findByworkexperience(workexperience);
	}

	@Override
	public List<JobPosting> viewJobsbydegree(String degree) {
		// TODO Auto-generated method stub
		return jobPostingRepo.findBydegree(degree);
	}

	@Override
	public List<JobPosting> changeorder(String profile) {
		// TODO Auto-generated method stub
		return jobPostingRepo.findByprofile(profile);
	}
}