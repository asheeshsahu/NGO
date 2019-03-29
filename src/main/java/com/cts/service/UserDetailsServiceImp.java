package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.dao.LoginDao;
import com.cts.entity.LoginEntity;
;

@Service("userDetailsService")
public class UserDetailsServiceImp implements UserDetailsService {

  @Autowired
  private LoginDao logindao;

  @Transactional(readOnly = true)
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    LoginEntity findByUsername = logindao.findByUsername(username);
    System.out.println(findByUsername);
    UserBuilder builder = null;
    if (findByUsername != null) {    
      builder = org.springframework.security.core.userdetails.User.withUsername(username);
      builder.password(findByUsername.getPassword());
      builder.authorities(findByUsername.getRole());
    } else {
      throw new UsernameNotFoundException("User not found.");
    }
    return builder.build();
  }
  
 
}
