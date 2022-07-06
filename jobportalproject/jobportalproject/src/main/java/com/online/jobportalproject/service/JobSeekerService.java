package com.online.jobportalproject.service;

import java.util.List;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.online.jobportalproject.entities.Jobseeker;


@Service
public interface JobSeekerService {
	
	public List<Jobseeker>getData(int id);
	
	public void addData(Jobseeker Jobseek);
	
	public void updateData(@RequestBody Jobseeker Jobseek);
	
	public List<Jobseeker> deleteData(@PathVariable("id") int id);

	public Optional<Jobseeker> selectuser(int id);

	public List<Jobseeker> searchbyworkexperience(int workexperience);

	public List<Jobseeker> searchbylocation(String location);

	public List<Jobseeker> searchbydegree(String degree);

	public List<Jobseeker> SelectheJobSeeker(int workexperience);

	public List<Jobseeker> addbookmarks();

	public Optional<Jobseeker> appliedusers(int id);
}