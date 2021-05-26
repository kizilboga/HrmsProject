package com.idris.HRMSProject.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idris.HRMSProject.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {
	User findByEmail(String email);
User findByEmailAndEmailVerifyCode(String email, String emailVerifyCode);
}
