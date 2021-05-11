package com.idris.HRMSProject.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.idris.HRMSProject.business.abstracts.UserService;
import com.idris.HRMSProject.dataAcces.abstracts.UserDao;
import com.idris.HRMSProject.entities.concretes.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.userDao.findAll();
	}

}
