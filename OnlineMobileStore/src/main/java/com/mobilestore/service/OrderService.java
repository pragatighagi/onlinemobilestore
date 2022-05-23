package com.mobilestore.service;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.criteria.Order;

import com.mobilestore.model.Customer;
import com.mobilestore.model.Response;

public interface OrderService {
	public Response<Order> addCategory(Order order);
	public Response<Order> updateCategory(Order order);
	public Response<List<Order>> getAllCategory();
	public Response<Order> getCart(LocalDate orderDate);
	public Response<Order> getCartByCustomer(Customer orderCustomer);
	public Response<Order> getCartByQuality(Integer orderQuantity);
    public Response<Order> getCartByTotalCost(Integer orderTotalCost);
    public Response<Order> getCartByCost(Integer orderCost);
    public Response<Order> getCartByStatus(String orderStatus);
    public Response<Order> getCartBydispatchDate(LocalDate orderdispatchDate );
	public Response<com.mobilestore.model.Order> addOrder(com.mobilestore.model.Order order);
	public Response<com.mobilestore.model.Order> updateOrder(com.mobilestore.model.Order order);
	public Response<List<com.mobilestore.model.Order>> getAllOrder();
	public Response<com.mobilestore.model.Order> getOrder(Integer catId);
	
	
}

