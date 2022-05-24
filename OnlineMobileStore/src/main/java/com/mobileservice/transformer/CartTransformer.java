package com.mobileservice.transformer;

import com.mobilestore.entity.CartEntity;
import com.mobilestore.model.Cart;

public class CartTransformer {
	public static com.mobilestore.entity.CartEntity transformCart(CartEntity entity2) {
		if (entity2 != null) {
			CartEntity entity = new com.mobilestore.entity.CartEntity();
			entity.setCartId(entity2.getCartId());
			entity.setMobile(entity2.getMobile());
			entity.setCustomer(entity2.getCustomer());
			entity.setQuantity(entity2.getQuantity());
			entity.setCost(entity2.getCost());
			
			
			return entity;
		}
		return null;
	}

	public static CartEntity transformCartEntity(Cart cart) {
		if (cart != null) {
			com.mobilestore.entity.CartEntity newcrt = new com.mobilestore.entity.CartEntity();
			newcrt.setCartId(cart.getCartId());
			newcrt.setMobile(cart.getMobile());
			newcrt.setCustomer(cart.getCustomer());
			newcrt.setQuantity(cart.getQuantity());
			newcrt.setCost(cart.getCost());
			
			
			return newcrt;
		}
		return null;
	}
	public static CartEntity transformCustomer(Cart cart) {
		// TODO Auto-generated method stub
		return null;
	}

	public static CartEntity transformCartEntity(CartEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
}

	
