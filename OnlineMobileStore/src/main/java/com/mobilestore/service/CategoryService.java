package com.mobilestore.service;

import java.util.List;

import com.mobilestore.model.Category;
import com.mobilestore.model.Response;



public interface CategoryService {
		
	public Response<Category> addCategory(Category category);
	public Response<Category> updateCategory(Category category);
	public Response<List<Category>> getAllCategory();
	public Response<Category> getCategory(Integer catId);
	public Response<Category> getCategoryByName(String catName);
}
