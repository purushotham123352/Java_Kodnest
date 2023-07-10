package com.example.demo.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository  
public class EmployeeDAOimp implements EmployeeDAO { 
	@PersistenceContext
	EntityManager em; 
	/*@Autowired 

	public EmployeeDAOimp(EntityManager em) { 

		this.em=em; 

	}*/ 

	@Override 

	public List<Employee> findAll() { 

		TypedQuery<Employee> query= em.createQuery("from Employee", Employee.class); 

		List<Employee> emplist=query.getResultList(); 

		return emplist; 

	} 

  

} 
