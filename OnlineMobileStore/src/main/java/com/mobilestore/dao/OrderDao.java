package com.mobilestore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobilestore.entity.OrderEntity;
@Repository
public interface OrderDao extends JpaRepository<OrderEntity, Integer> {
	OrderEntity findByOrderName(String OrderName);

}
