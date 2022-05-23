package com.mobilestore.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobilestore.entity.CategoryEntity;

	@Repository
	public interface CategoryDao extends JpaRepository<CategoryEntity, Integer> {
		CategoryEntity findByCategoryName(String categoryName);

		
	}
	
	
	



