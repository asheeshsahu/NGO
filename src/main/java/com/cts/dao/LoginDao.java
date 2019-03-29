package com.cts.dao;

import com.cts.entity.LoginEntity;

public interface LoginDao {
	
	public LoginEntity findByUsername(String username);

}
