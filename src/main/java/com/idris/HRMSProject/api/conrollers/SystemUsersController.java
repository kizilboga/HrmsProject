package com.idris.HRMSProject.api.conrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idris.HRMSProject.business.abstracts.SystemUserService;
import com.idris.HRMSProject.entities.concretes.SystemUser;

@RestController
@RequestMapping("/api/systemusers")
public class SystemUsersController {
	private SystemUserService systemUserService;

	@Autowired
	public SystemUsersController(SystemUserService systemUserService) {
		super();
		this.systemUserService = systemUserService;
	}

	public List<SystemUser> getAll() {
		return this.systemUserService.getAll();

	}

}
