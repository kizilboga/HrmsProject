package com.idris.HRMSProject.business.abstracts;

import java.util.List;

import com.idris.HRMSProject.core.results.DataResult;
import com.idris.HRMSProject.core.results.Result;
import com.idris.HRMSProject.entities.concretes.JobAdvertisement;
import com.idris.HRMSProject.entities.concretes.dtos.JobAdvertisementForAddDto;


public interface JobAdvertisementService {
    DataResult<List<JobAdvertisement>> findByIsActiveTrue();
    DataResult<List<JobAdvertisement>> findByIsActiveTrueOrderByCreateDate();
    DataResult<List<JobAdvertisement>> findByEmployer_EmployerId(int employerId);
    Result addNew(JobAdvertisementForAddDto jobAdvertisement);
    Result changeStatus(int advertisementId, int employerId);
}
