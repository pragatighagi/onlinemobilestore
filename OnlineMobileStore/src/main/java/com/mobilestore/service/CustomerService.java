package com.mobilestore.service;

import java.util.List;

import com.mobilestore.model.Category;
import com.mobilestore.model.Customer;
import com.mobilestore.model.Response;

public interface CustomerService {
	
	public Response<Category> addCategory(Category category);
	public Response<Category> updateCategory(Category category);
	public Response<List<Category>> getAllCategory();
	public Response<Category> getCategory(Integer catId);
	public Response<Category> getCategoryByName(String catName);
	public Response<Customer> updateCustomer(Customer customer);
	public Response<List<Customer>> getAllCustomer();
	public Response<Customer> getCustomer(Integer catId);
	
}
