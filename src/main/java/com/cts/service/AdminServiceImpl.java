package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.dao.AdminDao;
import com.cts.entity.UserPostDetails;

@Service("adminservice")
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao admindao;
	
	@Override
	@Transactional
	public List<UserPostDetails> getPosts() {
		// TODO Auto-generated method stub
		return admindao.showPost();
	}

	@Override
	@Transactional
	public boolean acceptPost(String title) {
		// TODO Auto-generated method stub
		return admindao.acceptPost(title);
	}

	@Transactional
	@Override
	public boolean update(UserPostDetails userPostDetails) {
		// TODO Auto-generated method stub
		return admindao.updatePost(userPostDetails);
	}

	@Transactional
	@Override
	public boolean delete(String title) {
		// TODO Auto-generated method stub
		return admindao.deletePost(title);
	}

}
