package com.idris.HRMSProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="employers")
public class Employer {
	
	@Id
	@Column(name="user_id", nullable=false)
	private int userId;
	
	@Column(name="company_name", nullable=false)
	private String companyName;
	
	@Column(name="phone", nullable=false)
	private String phone;
	
	@Column(name="verfied_by_system",nullable =false)
	private boolean verifiedBySystem;
	
	@Column(name="website", nullable=false)
	private String website;

}
