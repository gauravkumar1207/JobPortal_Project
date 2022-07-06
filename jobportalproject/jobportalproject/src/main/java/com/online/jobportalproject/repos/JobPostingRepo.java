package com.online.jobportalproject.repos;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.jobportalproject.entities.JobPosting;



@Repository
public interface JobPostingRepo extends JpaRepository<JobPosting, Integer> {

	List<JobPosting> findBylocation(String location);

	List<JobPosting> findByworkexperience(int workexperience);

	List<JobPosting> findBydegree(String degree);

	List<JobPosting> findByprofile(String profile);

	
}
