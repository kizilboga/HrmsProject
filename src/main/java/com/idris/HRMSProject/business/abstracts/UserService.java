package com.idris.HRMSProject.business.abstracts;

import java.util.List;

import com.idris.HRMSProject.entities.concretes.User;

public interface UserService {
List<User> getAll();
}
