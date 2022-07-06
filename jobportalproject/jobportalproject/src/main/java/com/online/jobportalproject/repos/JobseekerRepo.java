package com.online.jobportalproject.repos;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.jobportalproject.entities.Jobseeker;



@Repository
public interface JobseekerRepo extends JpaRepository<Jobseeker, Integer> {

	List<Jobseeker> findAllById(int id);

	List<Jobseeker> findByworkexperience(int workexperience);

	List<Jobseeker> findBylocation(String location);

	List<Jobseeker> findBydegree(String degree);

	
}
