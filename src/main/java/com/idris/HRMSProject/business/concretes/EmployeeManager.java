package com.idris.HRMSProject.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.idris.HRMSProject.business.abstracts.EmployeeService;
import com.idris.HRMSProject.dataAcces.abstracts.EmployeeDao;
import com.idris.HRMSProject.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {

	private EmployeeDao employeeDao;
	
	
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}


	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return this.employeeDao.findAll();
	}

	
}
