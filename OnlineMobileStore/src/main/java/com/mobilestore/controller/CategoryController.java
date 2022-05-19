package com.mobilestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mobilestore.entity.Category;
import com.mobilestore.service.CategoryService;


@Controller
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	 @PostMapping("category")
	public Category addCategory(@RequestBody Category category) {
		
		return this.categoryService.addCatogry(category);
	}
}
