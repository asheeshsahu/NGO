package com.cts.service;

import com.cts.entity.LoginEntity;

public interface RegisterService {

	boolean registerUser(LoginEntity loginEntity);
	boolean registerNGO(LoginEntity loginEntity);
	
}
