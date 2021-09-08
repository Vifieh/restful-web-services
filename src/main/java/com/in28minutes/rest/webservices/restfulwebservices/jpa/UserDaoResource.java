package com.in28minutes.rest.webservices.restfulwebservices.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28minutes.rest.webservices.restfulwebservices.jpa.entity.Employee;


@Repository
@Transactional
public class UserDaoResource {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(Employee employee) {
		entityManager.persist(employee);
		return employee.getId();
	}
}
