package com.mobilestore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobilestore.model.Category;
import com.mobilestore.model.Response;
import com.mobilestore.service.CategoryService;


@RestController
@RequestMapping("/categories")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService; 
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<Category> addCategory(@RequestBody Category category){
		return categoryService.addCategory(category);
	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<Category> updateCategory(@RequestBody Category category){
		return categoryService.updateCategory(category);
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<List<Category>> getAllCategory(){
		return categoryService.getAllCategory();
	}
	
	@GetMapping(value="/{catId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<Category> getCategory(@PathVariable("catId") Integer catId){
		return categoryService.getCategory(catId);
	}

}
