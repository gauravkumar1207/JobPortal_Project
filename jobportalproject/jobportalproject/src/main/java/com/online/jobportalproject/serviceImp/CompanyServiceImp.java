package com.online.jobportalproject.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.online.jobportalproject.entities.company;
import com.online.jobportalproject.repos.companyRepo;
import com.online.jobportalproject.service.companyService;


@Component
public class CompanyServiceImp implements companyService {
	
	//Scanner scanner=new Scanner(System.in);
	@Autowired
	companyRepo companyRepo;

	@Override
	public List<company> getData() {
		// TODO Auto-generated method stub
		return companyRepo.findAll();
	}

	@Override
	public void addData(company comp) {
		// TODO Auto-generated method stub
		companyRepo.save(comp);
	}

	@Override
	public void updateData(company comp) {
		// TODO Auto-generated method stub
		companyRepo.save(comp);
		
	}

	@Override
	public List<company> deleteData(int id) {
		// TODO Auto-generated method stub
		companyRepo.deleteById(id);
		return companyRepo.findAll();
	}
}