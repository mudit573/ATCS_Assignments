package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee employee); 
	Employee updateEmployee(Employee employee);
	String deleteEmployee(int ID);
	Employee getEmployee(int ID); 
	
	List<Employee> getAllEmployee();
	
	
}
