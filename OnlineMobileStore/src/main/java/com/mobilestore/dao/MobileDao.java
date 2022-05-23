package com.mobilestore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobilestore.entity.MobileEntity;



@Repository
public interface MobileDao extends JpaRepository<MobileEntity, Integer> {
	List<MobileEntity> findAllByCompanyName(String compName);
}
