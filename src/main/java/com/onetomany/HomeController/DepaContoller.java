package com.onetomany.HomeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onetomany.model.Department;
import com.onetomany.service.DepoService;

@RestController
@RequestMapping("/department")
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
	
	@DeleteMapping("delete/{id}")
	public String deleteUser(@PathVariable int id)
	{	
		depoService.deleteUser(id);
		return "the department is "+id;
		
	}
	
	@PutMapping("/update/{id}")
	public Department updateDepartment(@RequestBody Department department,@PathVariable int id)
	{
		return depoService.updateDepartment(department, id);
	}
}
