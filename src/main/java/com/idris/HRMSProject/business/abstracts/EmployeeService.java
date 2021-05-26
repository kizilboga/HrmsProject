package com.idris.HRMSProject.business.abstracts;

import java.util.List;



import com.idris.HRMSProject.core.results.DataResult;
import com.idris.HRMSProject.core.results.Result;
import com.idris.HRMSProject.entities.concretes.Employee;
import com.idris.HRMSProject.entities.concretes.dtos.EmployeeForRegisterDto;

public interface EmployeeService {
	DataResult<List<Employee>> getAll();
	Result register (EmployeeForRegisterDto employee);
	
}
