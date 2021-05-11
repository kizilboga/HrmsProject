package com.idris.HRMSProject.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="employees")
public class Employee {

	@Id
	@Column(name="user_id", nullable=false)
	private int userId;
	
	@Column(name="first_name", nullable=false)
	private String firstName;
	
	@Column(name="last_name", nullable=false)
	private String lastName;
	
	@Column(name="nationality_id", unique=true,nullable=false)
	private String natinalityId;
	
	@Column(name="date_of_birth", nullable=false)
	private Date dateOfBirth;
}
