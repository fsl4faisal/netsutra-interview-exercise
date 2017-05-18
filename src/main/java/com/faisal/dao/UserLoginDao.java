package com.faisal.dao;

import com.faisal.model.UserDetails;
import com.faisal.model.UserLogin;

public interface UserLoginDao {

	int checkLogin(UserLogin userLogin);
	UserDetails getUserDetails(int id);
	
}
