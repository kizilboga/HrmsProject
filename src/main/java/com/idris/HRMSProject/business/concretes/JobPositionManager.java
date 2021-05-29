package com.idris.HRMSProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idris.HRMSProject.business.abstracts.JobPositionService;
import com.idris.HRMSProject.core.results.DataResult;
import com.idris.HRMSProject.core.results.ErrorDataResult;
import com.idris.HRMSProject.core.results.ErrorResult;
import com.idris.HRMSProject.core.results.Result;
import com.idris.HRMSProject.core.results.SuccessDataResult;
import com.idris.HRMSProject.core.results.SuccessResult;
import com.idris.HRMSProject.dataAcces.abstracts.JobPositionDao;
import com.idris.HRMSProject.entities.concretes.JobPosition;


@Service
public class JobPositionManager implements JobPositionService{
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		return this.jobPositionDao.findAll();
	}

	@Override
	public JobPosition getByPositionName(String positionName) {
		return this.jobPositionDao.findByPositionName(positionName);
	}

	@Override
	public Result addNew(JobPosition jobPosition) {
		if(jobPosition.getPositionName() == null || jobPosition.getPositionName() == "")
			return new ErrorResult("İş pozisyon ismi boş bırakılamaz.");
		if(getByPositionName(jobPosition.getPositionName()) != null)
			return new ErrorResult("Aynı isimde iki adet iş pozisyonu oluşturulamaz.");
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("İş pozisyonu başarıyla eklendi.");
	}
	
	@Override
	public DataResult<JobPosition> getById(int id) {
		JobPosition jobPosition = jobPositionDao.findById(id);
		if(jobPosition==null) return new ErrorDataResult<JobPosition>();
	    return new SuccessDataResult<JobPosition>(jobPosition);
	}

}
