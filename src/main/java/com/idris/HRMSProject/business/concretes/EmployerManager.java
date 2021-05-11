package com.idris.HRMSProject.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.idris.HRMSProject.business.abstracts.EmployerService;
import com.idris.HRMSProject.dataAcces.abstracts.EmployerDao;

import com.idris.HRMSProject.entities.concretes.Employer;
@Service
public class EmployerManager implements EmployerService {
private EmployerDao employerDao;

	public EmployerManager(EmployerDao employerDao) {
	super();
	this.employerDao = employerDao;
}

	@Override
	public List<Employer> getAll() {
		// TODO Auto-generated method stub
		return this.employerDao.findAll();
	}

}
