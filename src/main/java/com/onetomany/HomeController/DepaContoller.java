package com.onetomany.HomeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onetomany.model.Department;
import com.onetomany.service.DepoService;

@RestController
public class DepaContoller {
	
	@Autowired
	private DepoService depoService;
	
	@GetMapping("start")
	public String Start()
	{
		return "started";
	}
	
	@PostMapping("/post")
	public Department createDepartment(@RequestBody Department department)
	{
		 return depoService.save(department);
		
	}
	
	@GetMapping("/get")
	public List<Department> getAllDepartments() {
	    return depoService.getAllDepartments();
	}

}
