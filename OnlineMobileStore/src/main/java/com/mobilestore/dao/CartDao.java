package com.mobilestore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobilestore.entity.CartEntity;
import com.mobilestore.model.Cart;
import com.mobilestore.serviceimpl.S;
@Repository
public interface CartDao  extends JpaRepository<CartEntity, Integer>{
CartEntity findByCartName(Object object);

CartEntity findByCartName11(Object cartName);

CartEntity findByCartName1(Object cartName);

void saveAll(Iterable<S> entity);
}
