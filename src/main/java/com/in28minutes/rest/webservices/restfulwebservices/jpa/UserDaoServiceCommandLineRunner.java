package com.in28minutes.rest.webservices.restfulwebservices.jpa;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.rest.webservices.restfulwebservices.jpa.entity.Employee;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{
	
	private static final Logger log = 
			LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Jill", "Admin");
		employeeRepository.save(employee);
		log.info("New User is created: " +employee);
		
		Optional<Employee> employeeOne = employeeRepository.findById(1L);
		log.info("User is retrieved: " +employee);
		 
		List<Employee> employees =  employeeRepository.findAll();
		log.info("All users: " +employees);
	}

}
 