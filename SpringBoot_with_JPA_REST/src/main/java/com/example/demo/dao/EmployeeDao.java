package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeDao {

	Employee addEmployee(Employee employee); 
	Employee updateEmployee(Employee employee);
	String deleteEmployee(int ID);
	Employee getEmployee(int ID); 
	
	List<Employee> getAllEmployee();
	
	
}
