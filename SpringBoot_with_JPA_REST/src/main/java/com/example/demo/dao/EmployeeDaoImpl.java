package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@PersistenceContext
	EntityManager entity;
	
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		entity.persist(employee);
		return entity.find(Employee.class, employee.getID());
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		return entity.merge(employee);
	}

	@Override
	public String deleteEmployee(int ID) {
		// TODO Auto-generated method stub
		Employee emp = entity.find(Employee.class, ID);
		if(emp!=null)
		{
			entity.remove(emp);
			return "Employee Deleted";
		}
		else
		{
			return "no employee found";
		}
	}

	@Override
	public Employee getEmployee(int ID) {
		// TODO Auto-generated method stub
		return entity.find(Employee.class, ID);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		TypedQuery<Employee> result = entity.createQuery("Select e from Employee e",Employee.class);
		return result.getResultList();
	}
	
	

}
