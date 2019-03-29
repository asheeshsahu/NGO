package com.cts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login_table")
public class LoginEntity {
	
	@Id
	@Column(name="emailId",length=30)
	String emailid;
	
	@Column(name="firstname",length=30)
	String firstname;

	@Column(name="lastname",length=30)
	String lastname;

	@Column(name="password",length=100)
	String password;

	@Column(name="age",length=2)
	int age;

	@Column(name="gender",length=6)
	String gender;
	
	@Column (name ="role", length=10)
	String role;

	public LoginEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "LoginEntity [emailid=" + emailid + ", firstname=" + firstname + ", lastname=" + lastname + ", password="
				+ password + ", age=" + age + ", gender=" + gender + ", role=" + role + "]";
	}

	

	
	
	
}
