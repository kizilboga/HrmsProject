package com.idris.HRMSProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idris.HRMSProject.business.abstracts.EmployeeService;
import com.idris.HRMSProject.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/getall")
	public List<Employee> getAll(){
		return employeeService.getAll();
		
	}
}