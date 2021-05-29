package com.idris.HRMSProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idris.HRMSProject.business.abstracts.CityService;
import com.idris.HRMSProject.core.results.DataResult;
import com.idris.HRMSProject.core.results.ErrorDataResult;
import com.idris.HRMSProject.core.results.SuccessDataResult;
import com.idris.HRMSProject.dataAcces.abstracts.CityDao;
import com.idris.HRMSProject.entities.concretes.City;


@Service
public class CityManager implements CityService{

	private CityDao cityDao;
	
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getAll() {
		
		return new SuccessDataResult<List<City>>(cityDao.findAll());
	}

	@Override
	public DataResult<City> getById(int id) {
		City city = cityDao.findById(id);
		if(city==null) return new ErrorDataResult<City>();
		return new SuccessDataResult<City>(city);
	}

	

}
