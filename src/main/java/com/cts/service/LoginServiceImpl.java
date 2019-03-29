package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.dao.LoginDao;
import com.cts.entity.LoginEntity;

@Service("loginservice")
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao logindao;
	

	@Override
	@Transactional
	public LoginEntity findByUsername(String username) {
		
		return logindao.findByUsername(username);
	}

}
