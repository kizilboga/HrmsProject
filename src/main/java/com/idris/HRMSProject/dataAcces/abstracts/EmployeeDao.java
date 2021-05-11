package com.idris.HRMSProject.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idris.HRMSProject.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
