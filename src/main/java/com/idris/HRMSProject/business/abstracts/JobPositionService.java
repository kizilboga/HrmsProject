package com.idris.HRMSProject.business.abstracts;

import java.util.List;

import com.idris.HRMSProject.core.results.Result;
import com.idris.HRMSProject.entities.concretes.JobPosition;


public interface JobPositionService {
	List<JobPosition> getAll();
    JobPosition getByPositionName(String positionName);
    Result addNew(JobPosition jobPosition);

}
