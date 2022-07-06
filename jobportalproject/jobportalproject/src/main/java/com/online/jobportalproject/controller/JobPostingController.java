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
import com.online.jobportalproject.service.JobPostingService;


@RestController
@RequestMapping("/JobPost")
public class JobPostingController {
	
	@Autowired
	JobPostingService jobPostingService;
	
	@GetMapping("/")
	public List<JobPosting>getData(){
		return jobPostingService.getData();
	}
	@PostMapping("/")
	public void saveData(@RequestBody JobPosting obj) {
		jobPostingService.addData(obj);
	}
	@PutMapping("/")
	public void updateData(@RequestBody JobPosting obj) {
		jobPostingService.updateData(obj);
	}
	@DeleteMapping("/{id}")
	public void deleteData(@PathVariable int id) {
		jobPostingService.deleteData(id);
	}
}