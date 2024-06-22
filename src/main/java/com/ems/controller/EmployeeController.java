package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepo;
	public Employee getEmployees()
	{
		return new Employee();
	}
}
