package com.in28minutes.rest.webservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.rest.webservices.restfulwebservices.jpa.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
