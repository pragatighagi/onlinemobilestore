package com.mobilestore.service;

import java.util.Collection;

import com.mobilestore.entity.Cart;
import com.mobilestore.entity.Order;
import com.mobilestore.entity.User;

public interface CartService {
	
	
	    Cart getCart(User user);

	    void mergeLocalCart(Collection<Order> Orders, User user);

	    void delete(String itemId, User user);

	    void checkout(User user);
	}

