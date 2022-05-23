package com.mobilestore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobilestore.entity.CartEntity;
@Repository
public interface CartDao  extends JpaRepository<CartEntity, Integer>{
CartEntity findByCartName(String CartName);
}
