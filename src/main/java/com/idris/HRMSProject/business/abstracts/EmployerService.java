package com.idris.HRMSProject.business.abstracts;

import java.util.List;

import com.idris.HRMSProject.entities.concretes.Employer;

public interface EmployerService {
List<Employer> getAll();
}
