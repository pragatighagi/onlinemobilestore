package com.mobilestore.service;

import java.util.Collection;

import com.mobilestore.entity.Cart;
import com.mobilestore.entity.User;
import com.mobilestore.repository.UserRepository;

public abstract class UserServiceImpl implements UserService {
	    
	    
	    @Autowired
	    UserRepository userRepository;
	    @Autowired
	    CartRepository cartRepository;

	    @Override
	    public User findOne(String username) {
	        return userRepository.findByUserName(username);
	    }

	    @Override
	    public Collection<User> findByRole(String role) {
	        return userRepository.findAllByRole(role);
	    }

	    @Override
	    
	    public User save(User user) {
	        
	      
	        try {
	            User savedUser = userRepository.save(user);

	            // initial Cart
	            Cart savedCart = cartRepository.save(new Cart(savedUser));
	            savedUser.setCart(savedCart);
	            return userRepository.save(savedUser);

	        } catch (Exception e) {
	            throw new MyException(ResultEnum.VALID_ERROR);
	        }

	    }

	    @Override
	   
	    public User update(User user) {
	        User oldUser = userRepository.findByUserName(user.getUsername());
	        Object userId;
			oldUser.setUserId(userId(user.getUserId()));
	        
	        
	        return userRepository.save(oldUser);
	    }

		protected abstract int userId(int userId);

	}


	


