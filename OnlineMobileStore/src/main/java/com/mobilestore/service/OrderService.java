package com.mobilestore.service;

import com.mobilestore.entity.Order;

public interface OrderService {
	


	
	    Page<Order> findAll();

	    Page<Order> findByStatus(Integer status);

	    Page<Order> findByBuyerEmail(String email );

	    Page<Order> findByBuyerPhone(String phone);

	    Order findOne(Long orderId);


	    Order finish(Long orderId);

	    Order cancel(Long orderId);
	    

	}


