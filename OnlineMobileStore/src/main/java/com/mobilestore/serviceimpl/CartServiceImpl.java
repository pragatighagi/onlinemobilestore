package com.mobilestore.serviceimpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileservice.transformer.CartTransformer;
import com.mobilestore.dao.CartDao;
import com.mobilestore.entity.CartEntity;
import com.mobilestore.model.AppError;
import com.mobilestore.model.Cart;
import com.mobilestore.model.Response;
import com.mobilestore.service.CartService;

@Service
public abstract class CartServiceImpl implements CartService{
	
	@Autowired
	private CartDao cartDao;

	public  Response<Cart> addCart(Cart cart) {
		Response<Cart> response = new Response<>();
		try {
			CartEntity entity = (CartEntity) cartDao.findByCartName(cart.getCartName());
			if (entity != null) {
				AppError error = new AppError();
				error.setCode("ERR_ADD_CART");
				error.setMessage("Cart already exists " + cart.getCartName());
				response.setError(error);
			} else {
				cart.setCartId(0);
				entity = CartTransformer.transformCartEntity(cart);
				cartDao.save(entity);
				CartEntity newCate = CartTransformer.transformCart(entity);
				response.setData(newCate);
			}
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_ADD_CART");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<Cart> updateCart(Cart cart) {
		Response<Cart> response = new Response<>();
		try {
			CartEntity entity = CartTransformer.transformCartEntity(cart);

			cartDao.save(entity);

			CartEntity newCate = CartTransformer.transformCartEntity(entity);
			response.setData(newCate);
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_UPDATING_CART");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public <cartDao> Response<List<Cart>> getAllCart() {
		Response<List<Cart>> response = new Response<>();
		try {
			List<CartEntity> entities = cartDao.findAll();
			List<Cart> categories = new ArrayList<>();
			if (entities != null) {
				for (CartEntity entity : entities) {
					@SuppressWarnings("unchecked")
					Collection<? extends Cart> newCate = (Collection<? extends Cart>) CartTransformer.transformCartEntity(entity);
					categories.addAll(newCate);
				}
			}
			response.setData(categories);
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_GETTING_CART");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<Cart> getCart(Integer catId) {
		Response<Cart> response = new Response<>();
		try {
			Optional<CartEntity> opEntity = cartDao.findById(catId);

			if (opEntity.isPresent()) {
				CartEntity entity = opEntity.get();
				CartEntity newCate = CartTransformer.transformCartEntity(entity);
				response.setData1(newCate);
			}
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_GETTING_CART");
			error.setMessage("No Cart found for id " + catId);
			response.setError(error);
		}
		return response;
	}

	public Response<Cart> getCartByName(String catName) {
		Response<Cart> response = new Response<>();
		try {
			CartEntity entity = cartDao.findByCartName(catName);
			if (entity != null) {
				CartEntity newCate = CartTransformer.transformCartEntity(entity);
				response.setData(newCate);
			}
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_GETTING_CART");
			error.setMessage("No Cart found with name " + catName);
			response.setError(error);
		}
		return response;
	}

}


