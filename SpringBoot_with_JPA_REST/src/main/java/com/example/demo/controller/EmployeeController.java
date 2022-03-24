package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.*;
import com.example.demo.service.*;

@RestController
@RequestMapping("/employee")   //link would be:  http://localhost:2323/employee
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	//we have four types of methods//	
	// post-->insert
	// get-->get
	// put-->save
	// delete-->remove
	
	
	@PostMapping("/addEmployee")     //http://localhost:2323/employee/addEmployee	
	public  Employee addEmployee(@RequestBody Employee emp)
	{
		return service.addEmployee(emp);
		
	}
	
	@PutMapping("/updateEmployee")     //http://localhost:2323/employee/updateEmployee	
	public  Employee updateEmployee(@RequestBody Employee emp)
	{
		return service.updateEmployee(emp);
		
	}
	
	@GetMapping("/getEmployee/{ID}")     //http://localhost:2323/employee/getEmployee/id	
	public  Employee getEmployee(@PathVariable("ID") int ID)
	{
		return service.getEmployee(ID);
		
	}
	
	@GetMapping("/getAllEmployee/{ID}")     //http://localhost:2323/employee/getAllEmployee	
	public  Iterable<Employee> getAllEmployees()
	{
		return service.getAllEmployee();	
	}
	
	@DeleteMapping("/deleteEmployee/{ID}")     //http://localhost:2323/employee/deleteEmployee/eid	
	public  void deleteEmployee(@PathVariable("ID") int ID)
	{
		 service.deleteEmployee(ID);
		
	}
	
	
	

}
