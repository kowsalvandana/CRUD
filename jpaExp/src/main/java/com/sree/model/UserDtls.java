package com.sree.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "USER_DTLS")
public class UserDtls {

	@Id
	@Column(name = "USER_ID")
	private Integer userId;

	@Column(name = "USER_NAME")
	private String username;

	@Column(name = "USER_EMAIL")
	private String userEmail;

	@Column(name = "USER_AGE")
	private Integer userAge;

	@Column(name = "USER_COUNTRY")
	private String userCountry;

	public UserDtls() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDtls(Integer userId, String username, String userEmail, Integer userAge, String userCountry) {
		super();
		this.userId = userId;
		this.username = username;
		this.userEmail = userEmail;
		this.userAge = userAge;
		this.userCountry = userCountry;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Integer getUserAge() {
		return userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	@Override
	public String toString() {
		return "UserDtls [userId=" + userId + ", username=" + username + ", userEmail=" + userEmail + ", userAge="
				+ userAge + ", userCountry=" + userCountry + "]";
	}
	

}
