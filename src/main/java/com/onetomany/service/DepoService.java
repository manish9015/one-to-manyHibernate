package com.onetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetomany.model.Department;
import com.onetomany.repository.DepatmentRepo;

@Service
public class DepoService 
{
	
	@Autowired
	private DepatmentRepo depatmentRepo;
	
	
	
	public Department save(Department department)
	{
		Department department2 = depatmentRepo.save(department);
		return department2;
	}
	
	public List<Department> getAllDepartments()
	{
		return depatmentRepo.findAll();
	}
	
	
}
