package com.cts.dao;

import com.cts.entity.LoginEntity;

public interface RegisterDAO {
	boolean registerUser(LoginEntity entity);
	boolean registerNGO(LoginEntity entity);
}
