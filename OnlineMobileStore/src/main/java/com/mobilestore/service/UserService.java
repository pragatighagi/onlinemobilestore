package com.mobilestore.service;

import java.util.List;

import com.mobilestore.entity.User;
import com.mobilestore.model.Response;

public interface UserService {
	public Response<User> addCategory(User user);
	public Response<User> updateCategory(User user);
	public Response<List<User>> getAllCategory();
	public Response<User> getCategory(Integer userId);
	public Response<User> getCategoryByName(String userUserName);
	public Response<User> getCategoryByRole(String userRole);
}

