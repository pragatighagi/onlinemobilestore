package com.mobilestore.serviceimpl;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobilestore.entity.OrderEntity;
import com.mobilestore.model.AppError;
import com.mobilestore.model.Order;
import com.mobilestore.model.Response;
import com.mobilestore.service.OrderService;



@Service
public abstract class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;

	@Autowired
	private CategoryDao categoryDao;

	@Override
	public Response<Order> addOrder(Order order) {
		Response<Order> response = new Response<>();
		try {
			Order.setOrderId(0);
			OrderEntity entity = OrderTransformer.transformOrder(order);
			entity.setCategory(categoryDao.findById(order.getCategory().getCategoryId()).orElse(null));
			entity = orderDao.save(entity);
			response.setData(orderTransformer.transformOrderEntity(entity));
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_ADDING_ORDER");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<Order> updateOrder(Order order) {
		Response<Order> response = new Response<>();
		try {
			OrderEntity entity = OrderTransformer.transformOrder(order);
			entity.setCategory(categoryDao.findById(order.getCategory().getCategoryId()).orElse(null));
			entity = orderDao.save(entity);
			response.setData(OrderTransformer.transformOrderEntity(entity));
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_UPDATING_ORDER");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<List<Order>> getAllOrders() {
		Response<List<Order>> response = new Response<>();
		try {
			List<OrderEntity> entities = orderDao.findAll();
			List<Order> orders = new ArrayList<Order>();
			if (entities != null) {
				for (OrderEntity entity : entities) {
					Order.add(OrderTransformer.transformOrderEntity(entity));
				}
			}
			response.setData(orders);

		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_GETTING_ORDERS");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	@Override
	public Response<Order> getOrder(Integer ordId) {
		Response<Order> response = new Response<>();
		try {
			Optional<OrderEntity> opEntity = orderDao.findById(ordId);
			if (opEntity.isPresent()) {
				response.setData(OrderTransformer.transformOrderEntity(opEntity.get()));
			}
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_GETTING_ORDER");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

	
	@Override
	public Response<Boolean> deleteOrder(Integer ordId) {
		Response<Boolean> response = new Response<>();
		try {
			orderDao.deleteById(ordId);
			response.setData(true);
		} catch (Exception e) {
			AppError error = new AppError();
			error.setCode("ERR_GETTING_ORDER");
			error.setMessage(e.getMessage());
			response.setError(error);
		}
		return response;
	}

}