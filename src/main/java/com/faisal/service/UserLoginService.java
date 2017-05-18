package com.faisal.service;

import com.faisal.model.UserDetails;
import com.faisal.model.UserLogin;

public interface UserLoginService {

	int checkLogin(UserLogin userLogin);
	UserDetails getUserDetails(int id);
}
