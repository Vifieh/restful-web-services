package com.in28minutes.rest.webservices.restfulwebservices.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	private String role;
	
	public Employee() {
		
	}
	public Employee(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRole() {
		return role;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	
	
}
