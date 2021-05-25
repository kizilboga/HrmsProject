package com.idris.HRMSProject.business.abstracts;

import java.util.List;

import com.idris.HRMSProject.core.results.DataResult;
import com.idris.HRMSProject.core.results.Result;
import com.idris.HRMSProject.entities.concretes.User;

public interface UserService {
	DataResult<List<User>> getAll();
	DataResult<User> getByEmail(String email);
	Result add (User user);
	Result verifyUser(String email, String verificationCode);
}
