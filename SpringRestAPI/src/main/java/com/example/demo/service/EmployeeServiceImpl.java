package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmployeeDAO;
import com.example.demo.entity.Employee;

@Service 

public class EmployeeServiceImpl implements EmployeeDAOService { 

	 

	EmployeeDAO edao; 

	 

	@Autowired 

	public EmployeeServiceImpl(EmployeeDAO edao) { 

		this.edao=edao; 

	} 

	 

	@Override 

	public List<Employee> findAll() { 

		return edao.findAll(); 

	} 

}  
