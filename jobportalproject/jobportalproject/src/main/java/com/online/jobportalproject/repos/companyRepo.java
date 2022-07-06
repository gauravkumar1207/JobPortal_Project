package com.online.jobportalproject.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.online.jobportalproject.entities.company;

@Repository
public interface companyRepo extends JpaRepository<company, Integer> {

	
}
