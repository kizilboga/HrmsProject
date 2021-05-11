package com.idris.HRMSProject.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.idris.HRMSProject.business.abstracts.SystemUserService;
import com.idris.HRMSProject.dataAcces.abstracts.SystemUserDao;
import com.idris.HRMSProject.entities.concretes.SystemUser;

@Service
public class SystemUserManager implements SystemUserService{
private SystemUserDao systemUserDao;

	public SystemUserManager(SystemUserDao systemUserDao) {
	super();
	this.systemUserDao = systemUserDao;
}

	@Override
	public List<SystemUser> getAll() {
		// TODO Auto-generated method stub
		return this.systemUserDao.findAll();
	}

}
