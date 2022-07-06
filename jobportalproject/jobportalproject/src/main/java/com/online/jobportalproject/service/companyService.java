package com.online.jobportalproject.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import com.online.jobportalproject.entities.company;

@Service
public interface companyService {

	
	public List<company> getData();
	
	public void addData(company comp);
	
	public void updateData(@RequestBody company comp);
	
	public List<company> deleteData(@PathVariable("id") int id);

}
