package com.faisal.service;

import com.faisal.model.UserDetails;

public interface UserDetailsService {

	UserDetails getUser(int id);
	void updateUser(UserDetails userDetails);
	void saveUser(UserDetails userDetails);
}
