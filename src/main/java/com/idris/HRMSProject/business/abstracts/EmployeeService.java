package com.idris.HRMSProject.business.abstracts;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;

import com.idris.HRMSProject.entities.concretes.Employee;


public interface EmployeeService {
List<Employee> getAll();
}
