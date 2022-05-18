package com.mobilestore.entity;

public class User {
	int userId;
	String username;
	String role;
	public User()
	{
		super();
	}
	public User(int userId, String username, String role) {
		super();
		this.userId = userId;
		this.username = username;
		this.role = role;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
