package com.idris.HRMSProject.business.abstracts;

import java.util.List;

import com.idris.HRMSProject.entities.concretes.JobPosition;

public interface JobPositionService {
List<JobPosition> getAll();
}
