package com.sree.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserDetails {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String Username;
	private String Password;
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDetails(Integer id, String username, String password) {
		super();
		this.id = id;
		Username = username;
		Password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", User_name=" + Username + ", Password=" + Password + "]";
	}
	
	

}
