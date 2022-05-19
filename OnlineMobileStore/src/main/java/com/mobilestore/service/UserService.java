package com.mobilestore.service;
	import java.util.Collection;

import com.mobilestore.entity.User;

	
	public interface UserService {
	    User findOne(String username);

	    Collection<User> findByRole(String role);

	    User save(User user);

	    User update(User user);
	}

