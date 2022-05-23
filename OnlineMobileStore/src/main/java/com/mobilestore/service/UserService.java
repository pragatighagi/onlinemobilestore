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
	Response<com.mobilestore.model.User> addUser(com.mobilestore.model.User User);
	Response<com.mobilestore.model.User> updateUser(com.mobilestore.model.User user);
	Response<List<com.mobilestore.model.User>> getAllUser();
	Response<com.mobilestore.model.User> getUser(Integer catId);
	Response<com.mobilestore.model.User> getUserByName(String catName);
}

