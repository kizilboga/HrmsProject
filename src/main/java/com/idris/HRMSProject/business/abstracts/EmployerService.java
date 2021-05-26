package com.idris.HRMSProject.business.abstracts;

import java.util.List;

import com.idris.HRMSProject.core.results.DataResult;
import com.idris.HRMSProject.core.results.Result;
import com.idris.HRMSProject.entities.concretes.Employer;
import com.idris.HRMSProject.entities.concretes.dtos.EmployerForRegisterDto;

public interface EmployerService {
	DataResult<List<Employer>> getAll();
	Result register(EmployerForRegisterDto employer);

}
