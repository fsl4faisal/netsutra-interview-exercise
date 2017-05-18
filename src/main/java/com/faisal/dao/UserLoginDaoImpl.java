package com.faisal.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.faisal.model.UserDetails;
import com.faisal.model.UserLogin;

@Repository
public class UserLoginDaoImpl implements UserLoginDao {

	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public int checkLogin(UserLogin userLogin) {
		
		Criteria criteria=sessionFactory.getCurrentSession()
		.createCriteria(UserLogin.class)
		.add(Restrictions.eq("username", userLogin.getUsername()))
		.add(Restrictions.eq("password",userLogin.getPassword()));
		
		List<UserLogin> list=criteria.list();
		
		if(list.size()==1){
			System.out.println("from checkLogin:"+list.get(0).getId());
			return list.get(0).getId();
		}
			
		System.out.println("from checkLogin: the list size was zero" );
		return 0;
	}

	@Override
	public UserDetails getUserDetails(int id) {
		
		//UserLogin userLogin =(UserLogin)sessionFactory.getCurrentSession().get(UserLogin.class, id);
		
		return (UserDetails)sessionFactory.getCurrentSession().get(UserDetails.class, id);
		
	}

}
