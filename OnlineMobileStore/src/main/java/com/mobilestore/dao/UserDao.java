package com.mobilestore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobilestore.entity.UserEntity;
@Repository
public interface UserDao extends JpaRepository<UserEntity, Integer> {
UserEntity findByUserName(String UserName);
}
