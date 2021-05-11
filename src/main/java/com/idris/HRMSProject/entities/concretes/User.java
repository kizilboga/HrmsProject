package com.idris.HRMSProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table (name="users")
public class User {

	public User() {
		
	}
	
	@Id
	@GeneratedValue
	@Column(name="id",nullable=false)
	private int id;
	
	@Column(name="email",unique=true, nullable=false)
	private String email;
	
	@Column(name="password", nullable=false)
	private String password;
	
	@Column(name="email_verified", nullable=false)
	private boolean emailVerified;
	
	
	
	
	
	
	
}
