package com.cts.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	LoginAuthenticationSuccessHandler successHandler;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		/*auth.inMemoryAuthentication()
		.passwordEncoder(passwordEncoder).withUser("user")
		.password(passwordEncoder.encode("123456")).roles("USER").and().withUser("admin")
		.password(passwordEncoder.encode("123456")).roles("USER","ADMIN");*/
		
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
		
	}
	
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/admin/**").hasRole("ADMIN")	.antMatchers("/**").hasAnyRole("ADMIN", "USER","NGO")
		.and().formLogin().loginPage("/").loginProcessingUrl("/login").successHandler(successHandler).permitAll()
		.and().logout().logoutSuccessUrl("/").permitAll().logoutUrl("/logout")
		.and().csrf().disable();
		
		
	}
	
	
	public SecurityConfig() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		
		web.ignoring().antMatchers("/register/**");

	}

}
