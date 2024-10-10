package com.onetomany.HomeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onetomany.model.Employee;
import com.onetomany.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/get")
	public List<Employee> getEmployees()
	{
		return employeeService.getEmployees();
	}
	
	@PutMapping("/update/{id}")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable int id)
	{
		return employeeService.updateEmployee(employee, id);
	}
}
