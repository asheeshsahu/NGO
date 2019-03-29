package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.RegisterDAO;
import com.cts.entity.LoginEntity;

@Service("registerservice")
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	RegisterDAO registerDao;
	
	@Override
	public boolean registerUser(LoginEntity loginEntity) {
		return registerDao.registerUser(loginEntity);
	}

	@Override
	public boolean registerNGO(LoginEntity loginEntity) {
		return registerDao.registerUser(loginEntity);
	}

}
