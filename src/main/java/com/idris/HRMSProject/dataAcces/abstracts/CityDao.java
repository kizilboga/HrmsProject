package com.idris.HRMSProject.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idris.HRMSProject.entities.concretes.City;


public interface CityDao extends JpaRepository<City,Integer>{
     City findById(int id);
}
