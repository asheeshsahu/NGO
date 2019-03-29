package com.cts.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.entity.LoginEntity;

@Repository("logindao")
public class LoginDaoImpl implements LoginDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public LoginEntity findByUsername(String username) {
		 LoginEntity loginEntity = sessionFactory.getCurrentSession().get(LoginEntity.class, username);
		System.out.println(loginEntity);
		 return loginEntity;
	}

}
