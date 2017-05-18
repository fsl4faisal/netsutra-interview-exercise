package com.faisal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.faisal.dao.UserDetailsDao;
import com.faisal.model.UserDetails;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserDetailsDao userDetailsDao;
	
	
	@Override
	@Transactional
	public UserDetails getUser(int id) {
		return userDetailsDao.getUser(id);
	}

	@Override
	@Transactional
	public void updateUser(UserDetails userDetails) {
		userDetailsDao.updateUser(userDetails);
	}

	@Override
	@Transactional
	public void saveUser(UserDetails userDetails) {
		userDetailsDao.saveUser(userDetails);
		
	}

}
