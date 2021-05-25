package com.idris.HRMSProject.api.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idris.HRMSProject.business.abstracts.UserService;
import com.idris.HRMSProject.core.results.DataResult;
import com.idris.HRMSProject.core.results.Result;
import com.idris.HRMSProject.entities.concretes.User;


@RestController
@RequestMapping("/api/users")
public class UsersController {
	private UserService userService;
	
	
	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}



	@GetMapping("/getall")
    public DataResult<List<User>> getAll(){
    	return userService.getAll();
    }
	@PostMapping("/verify")
	public Result verify(String email, String verifyCode) {
		return userService.verifyUser(email, verifyCode);
	}
}
