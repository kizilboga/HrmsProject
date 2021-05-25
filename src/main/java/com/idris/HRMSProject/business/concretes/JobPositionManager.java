package com.idris.HRMSProject.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.idris.HRMSProject.business.abstracts.JobPositionService;
import com.idris.HRMSProject.dataAcces.abstracts.JobPositionDao;
import com.idris.HRMSProject.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{
private JobPositionDao jobPositionDao;

	public JobPositionManager(JobPositionDao jobPositionDao) {
	super();
	this.jobPositionDao = jobPositionDao;
}

	@Override
	public List<JobPosition> getAll() {
		// TODO Auto-generated method stub
		return jobPositionDao.findAll();
	}

}
