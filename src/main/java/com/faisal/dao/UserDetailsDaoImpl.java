package com.faisal.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.faisal.model.UserDetails;

@Repository
public class UserDetailsDaoImpl implements UserDetailsDao {

	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public UserDetails getUser(int id) {
		return (UserDetails)sessionFactory.getCurrentSession().get(UserDetails.class, id);
		
	}

	@Override
	public void updateUser(UserDetails userDetails) {
		sessionFactory.getCurrentSession().update(userDetails);
	}

	@Override
	public void saveUser(UserDetails userDetails) {
		sessionFactory.getCurrentSession().save(userDetails);
	}

}
