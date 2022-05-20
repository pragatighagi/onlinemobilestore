package com.mobilestore.service;

import java.util.List;

import com.mobilestore.entity.Customer;
import com.mobilestore.model.Cart;
import com.mobilestore.model.Response;




public interface CartService {
	public Response<Cart> addCategory(Cart cart);
	public Response<Cart> updateCategory(Cart cart);
	public Response<List<Cart>> getAllCategory();
	public Response<Cart> getCart(Integer catId);
	public Response<Cart> getCartByCustomer(Customer cartCustomer);
	public Response<Cart> getCartByQuality(Integer cartQuantity);
    public Response<Cart> getCartByCost(Integer cartCost);
}