package com.cts.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.dao.UserPostDao;
import com.cts.entity.UserPostDetails;
@Service("userpostservice")
public class UserPostServiceImpl  implements UserPostService{

	@Autowired
	UserPostDao userpostdao;
	
	@Transactional
	@Override
	public List<UserPostDetails> showPost() {
		return userpostdao.showPost();

	}

	@Transactional
	@Override
	public boolean addPost(UserPostDetails userPostDetails) {
		return userpostdao.addPost(userPostDetails);
	
	}

	@Override
	@Transactional
	public boolean deletePost(String title) {
		
		return userpostdao.deletePost(title);
	}

}
