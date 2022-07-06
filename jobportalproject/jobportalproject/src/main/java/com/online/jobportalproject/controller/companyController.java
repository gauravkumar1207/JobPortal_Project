package com.online.jobportalproject.controller;
import java.util.List;


import java.util.Optional;

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
import com.online.jobportalproject.entities.company;
import com.online.jobportalproject.entities.message;
import com.online.jobportalproject.repos.messageRepo;
import com.online.jobportalproject.service.JobPostingService;
import com.online.jobportalproject.service.JobSeekerService;
import com.online.jobportalproject.service.companyService;

@RestController
@RequestMapping("/company")
public class companyController {

	@Autowired
	companyService companyService;
	
	@Autowired
	JobSeekerService jobSeekerService;
	
	@Autowired
	JobPostingService jobPostingService;	
	
	@Autowired
	messageRepo messageRepo;
	
	@GetMapping("/")
	public List<company>getData(){
		return companyService.getData();
	}
	//Add data in company[2]
	@PostMapping("/")
	public void addData(@RequestBody company obj) {
		companyService.addData(obj);
	}
	@PutMapping("/")
	public void updateData(@RequestBody company obj) {
		companyService.updateData(obj);
	}
	@DeleteMapping("/{id}")
	public List<company> deleteData(@PathVariable int id) {
		return companyService.deleteData(id);
	}
	//selected candidate by id[9]
	@GetMapping("/selectuser/{id}")
	public Optional<Jobseeker> selectuser(@PathVariable int id){
		return jobSeekerService.selectuser(id);
	}
	//view order of Jobs[15]
	@GetMapping("/orderofJobs/{profile}")
	public List<JobPosting>changeorder(@PathVariable String profile ){
		return jobPostingService.changeorder(profile);	
}
	//candidate profile based on [loc,experience,degree][16]
	@GetMapping("/searchbywexp/{workexperience}")
	public List<Jobseeker>searchbyworkexperience(@PathVariable int workexperience){
		return jobSeekerService.searchbyworkexperience(workexperience);
	}
	@GetMapping("/searchbyloc/{location}")
	public List<Jobseeker>searchbylocation(@PathVariable String location){
		return jobSeekerService.searchbylocation(location);
	}
	@GetMapping("/searchbydeg/{degree}")
	public List<Jobseeker>degree(@PathVariable String degree){
		return jobSeekerService.searchbydegree(degree);
	}
	//select the job seeker[17]
	@GetMapping("/selectthejobseeker/{workexperience}")
	public List<Jobseeker> SelectheJobSeeker(@PathVariable int workexperience){
			//ls1=jobSeekerService.SelectheJobSeeker(id);
			return jobSeekerService.SelectheJobSeeker(workexperience);
			
	}
	@GetMapping("/bookmarks")
	public List<Jobseeker> addbookmarks(){
		return jobSeekerService.addbookmarks();
			
	}
	//see msg by company[14]	
	@GetMapping("/seemsg/")
	public List<message>getseemsg(){
		return messageRepo.findAll();
	}
	@GetMapping("/applieduser/{id}")
	public Optional<Jobseeker>applieduser(@PathVariable int id){
		return jobSeekerService.appliedusers(id);
	}


	
}

