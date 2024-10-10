package com.onetomany.service;

import java.util.List;
import java.util.Optional;

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
	
	public boolean deleteUser(int id)
	{
		if(depatmentRepo.findById(id).isPresent())
		{
			depatmentRepo.deleteById(id);
			return true;
		}
		throw new IllegalArgumentException("No data is found on this "+id);
	}
	
	public Department updateDepartment(Department department,int id)
	{
		Optional<Department> optionaldepartment=depatmentRepo.findById(id);
		
		if(optionaldepartment.isPresent())
		{
			Department department2=optionaldepartment.get();
			
			department2.setName(department.getName());
			return depatmentRepo.save(department2);
		}
		throw new IllegalArgumentException("no student is found "+id);
	}
	
}
