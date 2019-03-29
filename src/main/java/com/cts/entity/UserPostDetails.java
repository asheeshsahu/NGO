package com.cts.entity;

import java.sql.Date;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="User_post_details")
public class UserPostDetails {
	
	@Id
	@Column(name="title", length=50)
	String title;
	
	@Column(name="category", length=50)
	String category;
	
	@Column(name="date")
	Date date;
	
	
	@Column(name="address",length=100)
	String address;
	
	@Column(name="city",  length=50)
	String  city;

	@Column(name="zipcode",length=6)
	String zipcode;
	
	@Column(name="shortdescription",length=100)
	String shortdescription ;
	
	@Column(name="picture")
	byte[] picture;

	
	//Status 1 when user posts, 2 when ngo select posts, 3 when admin accepts, 0 when admin reject
	int status;
	
	
	
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getShortdescription() {
		return shortdescription;
	}

	public void setShortdescription(String shortdescription) {
		this.shortdescription = shortdescription;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		return "UserPostDetails [title=" + title + ", category=" + category + ", date=" + date + ", address=" + address
				+ ", city=" + city + ", zipcode=" + zipcode + ", shortdescription=" + shortdescription + ", picture="
				+ Arrays.toString(picture) + "]";
	}

	public UserPostDetails(String title, String category, Date date, String address, String city, String zipcode,
			String shortdescription, byte[] picture) {
		super();
		this.title = title;
		this.category = category;
		this.date = date;
		this.address = address;
		this.city = city;
		this.zipcode = zipcode;
		this.shortdescription = shortdescription;
		this.picture = picture;
	}

	public UserPostDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
