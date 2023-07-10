package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeDAOService;

@RestController 

public class EmployeeController { 

 

	EmployeeDAOService eds; 

	@Autowired 

	public EmployeeController(EmployeeDAOService eds) { 

		this.eds=eds; 

	} 

	 

	@GetMapping("/getallemployees") 

	public List<Employee> findAllEmployees() 

	{ 

		return eds.findAll(); 

	} 

	 

} 