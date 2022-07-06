package com.online.jobportalproject.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.online.jobportalproject.entities.message;



@Repository
public interface messageRepo extends JpaRepository<message, Integer> {

	
}
