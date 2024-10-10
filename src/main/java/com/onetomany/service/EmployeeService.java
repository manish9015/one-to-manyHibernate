package com.onetomany.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetomany.model.Employee;
import com.onetomany.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public List<Employee> getEmployees()
	{
		return employeeRepo.findAll();
	}
	
	public Employee updateEmployee(Employee employee,int id)
	{
		Optional<Employee> employeeOptional=employeeRepo.findById(id);
		
		if (employeeOptional.isPresent()) 
		{
			Employee employee2=employeeOptional.get();
			employee2.setName(employee.getName());
			employee2.setPosition(employee.getPosition());
			return employeeRepo.save(employee2);
		}
		 throw new IllegalArgumentException("no employee is found"+id);
		
	}
}
