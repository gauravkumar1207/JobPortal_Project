package com.online.jobportalproject.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.jobportalproject.entities.JobPosting;
import com.online.jobportalproject.entities.Jobseeker;
import com.online.jobportalproject.entities.message;
import com.online.jobportalproject.repos.messageRepo;
import com.online.jobportalproject.service.JobPostingService;
import com.online.jobportalproject.service.JobSeekerService;

@RestController
@RequestMapping("/jobseeker")
public class JobseekerController {
	
	@Autowired
	JobSeekerService jobSeekerService;
	
	@Autowired
	JobPostingService jobPostingService;
	
	@Autowired
	messageRepo messageRepo;
	
	//checklist of appliedJobs[7]
	@GetMapping("/appliedjobs/{id}")
	public List<Jobseeker>getData(@PathVariable int id){
		return jobSeekerService.getData(id);
	}
	@PostMapping("/")
	public void saveData(@RequestBody Jobseeker obj) {
		jobSeekerService.addData(obj);
	}
	@PutMapping("/")
	public void updateData(@RequestBody Jobseeker obj) {
		jobSeekerService.updateData(obj);
	}
	@DeleteMapping("/{id}")
	public void deleteData(@PathVariable int id) {
		jobSeekerService.deleteData(id);
	}
	//View Jobs[3]
	@GetMapping("/viewJobs")
	public List<JobPosting> viewJobs() {
		 return jobPostingService.viewJobs();
	}
	//View Jobs by Location[4]
	@GetMapping("/Jobsbyloc/{location}")
	public List<JobPosting>viewJobbyloc(@PathVariable String location)
	{
		return jobPostingService.viewJobbyloc(location);	
	}
	//View Jobs by workexperience[4]
	@GetMapping("/Jobsbyexp/{workexperience}")
	public List<JobPosting>viewJobByExp(@PathVariable int workexperience)
	{
		return jobPostingService.viewJobsbyExp(workexperience);
	}
	//search the job by degree description[12]
	@GetMapping("/jobsbydegree/{degree}")
	public List<JobPosting>viewJobsbydegree(@PathVariable String degree)
	{
		return jobPostingService.viewJobsbydegree(degree);
		
	}
	//Add data in company[13]
	@PostMapping("/adddata/")
	public void savedata(@RequestBody message msg) {
		messageRepo.save(msg);

}
	
	

}