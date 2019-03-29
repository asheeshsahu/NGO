package com.cts.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.entity.LoginEntity;

@Repository("registerdao")
public class RegisterDAOImpl implements RegisterDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public boolean registerUser(LoginEntity entity) {
		try{
			sessionFactory.getCurrentSession().save(entity);
		}catch (Exception e) {
			return true;
		}
		
		return false;
	}

	@Transactional
	@Override
	public boolean registerNGO(LoginEntity entity) {
		try{
			sessionFactory.getCurrentSession().save(entity);
		}catch (Exception e) {
			return true;
		}
		
		return false;
	}

}
