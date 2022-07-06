package com.online.jobportalproject.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.jobportalproject.entities.JobApplication;



@Repository
public interface JobApplicationRepo extends JpaRepository<JobApplication, Integer> {

	
}
