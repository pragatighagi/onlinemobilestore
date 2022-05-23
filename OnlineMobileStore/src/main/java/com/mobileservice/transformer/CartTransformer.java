package com.mobileservice.transformer;

import com.mobilestore.entity.CartEntity;
import com.mobilestore.model.Cart;

public class CartTransformer {
	public static com.mobilestore.entity.CartEntity transformCart(com.mobilestore.entity.CartEntity cart) {
		if (cart != null) {
			CartEntity entity = new com.mobilestore.entity.CartEntity();
			entity.setCartId(cart.getCartId());
			entity.setMobile(cart.getMobile());
			entity.setCustomer(cart.getCustomer());
			entity.setQuantity(cart.getQuantity());
			entity.setCost(cart.getCost());
			
			
			return entity;
		}
		return null;
	}

	public static CartEntity transformCartEntity(com.mobilestore.entity.CartEntity entity) {
		if (entity != null) {
			com.mobilestore.entity.CartEntity newcrt = new com.mobilestore.entity.CartEntity();
			newcrt.setCartId(entity.getCartId());
			newcrt.setMobile(entity.getMobile());
			newcrt.setCustomer(entity.getCustomer());
			newcrt.setQuantity(entity.getQuantity());
			newcrt.setCost(entity.getCost());
			
			
			return newcrt;
		}
		return null;
	}
	public static CartEntity transformCustomer(Cart cart) {
		// TODO Auto-generated method stub
		return null;
	}
}

	
