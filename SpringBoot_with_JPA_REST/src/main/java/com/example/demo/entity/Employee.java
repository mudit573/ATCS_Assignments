package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	
	@Id
	private int ID;
	private String Name;
	private int Salary;
	private String Address;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int iD, String name, int salary, String address) {
		super();
		ID = iD;
		Name = name;
		Salary = salary;
		Address = address;
	}
	
	
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", Name=" + Name + ", Salary=" + Salary + ", Address=" + Address + "]";
	}
	
	

}
