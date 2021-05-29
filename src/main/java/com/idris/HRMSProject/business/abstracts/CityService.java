package com.idris.HRMSProject.business.abstracts;

import java.util.List;

import com.idris.HRMSProject.core.results.DataResult;
import com.idris.HRMSProject.entities.concretes.City;


public interface CityService {
       DataResult<List<City>> getAll();
       DataResult<City> getById(int id);
}
