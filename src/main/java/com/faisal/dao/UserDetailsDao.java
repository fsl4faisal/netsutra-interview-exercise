package com.faisal.dao;

import com.faisal.model.UserDetails;

public interface UserDetailsDao {

	UserDetails getUser(int id);
	void updateUser(UserDetails userDetails);
	void saveUser(UserDetails userDetails);
}
