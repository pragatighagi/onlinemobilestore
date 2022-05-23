package com.mobilestore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobilestore.entity.CustomerEntity;
@Repository
public interface CustomerDao extends JpaRepository<CustomerEntity, Integer> {
 List<CustomerEntity> findByCustomerName(String CustomerName);
}
