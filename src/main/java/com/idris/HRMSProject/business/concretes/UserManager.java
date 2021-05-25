package com.idris.HRMSProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idris.HRMSProject.business.abstracts.UserService;
import com.idris.HRMSProject.core.helpers.EmailService;
import com.idris.HRMSProject.core.results.DataResult;
import com.idris.HRMSProject.core.results.ErrorResult;
import com.idris.HRMSProject.core.results.Result;
import com.idris.HRMSProject.core.results.SuccessDataResult;
import com.idris.HRMSProject.core.results.SuccessResult;
import com.idris.HRMSProject.dataAcces.abstracts.UserDao;
import com.idris.HRMSProject.entities.concretes.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	private EmailService emailService;
	
	@Autowired
	public UserManager(UserDao userDao, EmailService emailService) {
		super();
		this.userDao = userDao;
		this.emailService=emailService;
	}


	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(userDao.findAll());
	}

	@Override
	public DataResult<User> getByEmail(String email) {
		
		return new SuccessDataResult<User>(userDao.findByEmail(email));
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		this.emailService.send(user.getEmail(),
				"Doğrulama Linki", 
				"HRMS Sistemine hoşgeldiniz. "
				+ "Aşşağıdaki linke tıklayarak üyeliğinizi doğrulayabilirsiniz \n "
				+ "www.localhost:8080/api/users/verify?email=" + user.getEmail() + "&verifycode=" + user.getEmailVerifyCode());
		return new SuccessResult();
	}

	@Override
	public Result verifyUser(String email, String verificationCode) {
		
		User user = userDao.findByEmailAndEmailVerificationCode(email, verificationCode);
		if (user== null) 
			return new ErrorResult ("Doğrulama başarısız, lütfen bilgilerinizi tekrar giriniz!");

		user.setEmailVerified(true);
		userDao.save(user);
		return new SuccessResult ("Kullanıcı e-postası başarıyla doğrulandı.");
			

		
	}

}
