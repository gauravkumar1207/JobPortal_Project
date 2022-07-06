package com.online.jobportalproject.serviceImp;

import java.util.ArrayList;


//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.online.jobportalproject.entities.Jobseeker;
import com.online.jobportalproject.repos.JobseekerRepo;
import com.online.jobportalproject.service.JobSeekerService;



@Component
public class JobseekerServiceImp implements JobSeekerService {

	List<Jobseeker>listls=new ArrayList<Jobseeker>();
	
	@Autowired
	JobseekerRepo jobSeekerRepo;
	
	
	@Override
	public List<Jobseeker> getData(int id) {
		// TODO Auto-generated method stub
		return jobSeekerRepo.findAllById(id);
	}

	@Override
	public void addData(Jobseeker Jobseek) {
		// TODO Auto-generated method stub
		jobSeekerRepo.save(Jobseek);
		
	}

	@Override
	public void updateData(Jobseeker Jobseek) {
		// TODO Auto-generated method stub
		jobSeekerRepo.save(Jobseek);
		
	}

	@Override
	public List<Jobseeker> deleteData(int id) {
		// TODO Auto-generated method stub
		jobSeekerRepo.deleteById(id);
		return jobSeekerRepo.findAll() ;
	}

	@Override
	public Optional<Jobseeker> selectuser(int id) {
		// TODO Auto-generated method stub
		return jobSeekerRepo.findById(id);
	}

	@Override
	public List<Jobseeker> searchbyworkexperience(int workexperience) {
		// TODO Auto-generated method stub
		return jobSeekerRepo.findByworkexperience(workexperience);
	}

	@Override
	public List<Jobseeker> searchbylocation(String location) {
		// TODO Auto-generated method stub
		return jobSeekerRepo.findBylocation(location);
	}

	@Override
	public List<Jobseeker> searchbydegree(String degree) {
		// TODO Auto-generated method stub
		return jobSeekerRepo.findBydegree(degree);
	}

	@Override
	public List<Jobseeker> SelectheJobSeeker(int workexperience) {
		List<Jobseeker>list=jobSeekerRepo.findAll();
		List<Jobseeker>listfinalJobSeekers=new ArrayList<Jobseeker>();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getWorkexperience()>=workexperience) {
				listfinalJobSeekers.add(list.get(i));
				listls.add(list.get(i));
				
			}
		}
		return listfinalJobSeekers;
	}

	@Override
	public List<Jobseeker> addbookmarks() {
		// TODO Auto-generated method stub
		return listls;
	}

	@Override
	public Optional<Jobseeker> appliedusers(int id) {
		// TODO Auto-generated method stub
		return jobSeekerRepo.findById(id);
	}
	
	
}
