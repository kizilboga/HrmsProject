package com.idris.HRMSProject.core.helpers;

import org.springframework.stereotype.Service;

import com.idris.HRMSProject.core.results.Result;
import com.idris.HRMSProject.core.results.SuccessResult;



@Service
public class EmailManager implements EmailService{

	@Override
	public Result send(String to, String title, String message) {
		return new SuccessResult("E-posta başarıyla gönderildi.");
	}

}
