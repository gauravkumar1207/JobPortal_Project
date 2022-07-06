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

import com.online.jobportalproject.entities.JobApplication;
import com.online.jobportalproject.service.JobApplicationService;

@RestController
@RequestMapping("/jobapp")
public class JobApplicationController {
	
	@Autowired
	JobApplicationService jobApplicationService;
	
	@GetMapping("/")
	public List<JobApplication>getData(){
		return jobApplicationService.getData();
	}
	@PostMapping("/")
	public void saveData(@RequestBody JobApplication obj) {
		jobApplicationService.addData(obj);
	}
	@PutMapping("/")
	public void updateData(@RequestBody JobApplication obj) {
		jobApplicationService.updateData(obj);
	}
	@DeleteMapping("/{id}")
	public void deleteData(@PathVariable int id) {
		jobApplicationService.deleteData(id);
	}
	

}
