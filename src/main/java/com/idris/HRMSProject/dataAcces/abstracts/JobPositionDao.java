package com.idris.HRMSProject.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idris.HRMSProject.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {
	JobPosition findByPositionName(String positionName);
	JobPosition findById(int id);
}
