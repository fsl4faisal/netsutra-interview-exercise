package com.faisal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.faisal.dao.UserLoginDao;
import com.faisal.model.UserDetails;
import com.faisal.model.UserLogin;

@Service
public class UserLoginServiceImpl implements UserLoginService {

	@Autowired
	UserLoginDao userLoginDao;
	
	
	@Override
	@Transactional
	public int checkLogin(UserLogin userLogin) {
		return userLoginDao.checkLogin(userLogin);
	}

	@Override
	@Transactional
	public UserDetails getUserDetails(int id) {
		return userLoginDao.getUserDetails(id);
	}

}
