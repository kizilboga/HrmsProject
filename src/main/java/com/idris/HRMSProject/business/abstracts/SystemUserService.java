package com.idris.HRMSProject.business.abstracts;

import java.util.List;

import com.idris.HRMSProject.entities.concretes.SystemUser;

public interface SystemUserService {
List<SystemUser> getAll();
}
