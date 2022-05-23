package com.mobileservice.transformer;


	import com.mobilestore.entity.OrderEntity;
	import com.mobilestore.model.Order;

	public class OrderTransformer{
			public static com.mobilestore.entity.OrderEntity transformOrder(com.mobilestore.entity.OrderEntity order)
			{
				if (order != null) {
					OrderEntity entity = new com.mobilestore.entity.OrderEntity();
					entity.setOrderDate(order.getOrderDate());
					entity.setDispatchDate(order.getDispatchDate());
					entity.setQuantity(order.getQuantity());
					entity.setCost(order.getCost());
					entity.setTotalcost(order.getTotalcost());
					entity.setStatus(order.getStatus());
					entity.setCustomer(order.getCustomer());
					
					
					return entity;
				}
				return null;
			}
			public static OrderEntity transformOrderEntity(com.mobilestore.entity.OrderEntity entity) {
				if (entity != null) {
					com.mobilestore.entity.OrderEntity newOrd = new com.mobilestore.entity.OrderEntity();
					newOrd.setOrderDate(entity.getOrderDate());
					newOrd.setDispatchDate(entity.getDispatchDate());
					newOrd.setQuantity(entity.getQuantity());
					newOrd.setCost(entity.getCost());
					newOrd.setTotalcost(entity.getTotalcost());
					newOrd.setStatus(entity.getStatus());
					newOrd.setCustomer(entity.getCustomer());
					
					
					return newOrd;
				}
				return null;
			}
			public static OrderEntity transformCustomer(Order order) {
				// TODO Auto-generated method stub
				return null;
			}
		}


