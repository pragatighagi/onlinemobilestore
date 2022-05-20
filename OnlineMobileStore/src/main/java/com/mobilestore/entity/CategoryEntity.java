package com.mobilestore.entity;


import java.util.List;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;




	@Data
	@Entity
	@Table(name = "category")
	public class CategoryEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		@Column(name = "categoryId")
		private int categoryId;
		@Column(name = "categoryName")
		private String categoryName;

		@OneToMany(mappedBy = "category")
		private List<MobileEntity> mobile;

		public Object getCategoryId() {
			// TODO Auto-generated method stub
			return null;
		}

		public void setCategoryId(Object categoryId2) {
			// TODO Auto-generated method stub
			
		}

		public Object getCategoryName() {
			// TODO Auto-generated method stub
			return null;
		}

		public void setCategoryName(Object categoryName2) {
			// TODO Auto-generated method stub
			
		}



}

