package com.cts.service;

import com.cts.entity.LoginEntity;

public interface LoginService {
	LoginEntity findByUsername(String username);
}
