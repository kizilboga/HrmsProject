package com.idris.HRMSProject.core;

import com.idris.HRMSProject.core.results.Result;

public interface IdentityValidationService {
   Result validate(String tckn, String firstName, String lastName, int yearOfDate);
}
