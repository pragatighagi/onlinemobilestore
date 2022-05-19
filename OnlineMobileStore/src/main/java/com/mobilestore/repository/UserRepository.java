package com.mobilestore.repository;
import com.mobilestore.entity.User;

import java.util.Collection;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUserName(String name);
    Collection<User> findAllByRole(String role);
	User save(User user);

}