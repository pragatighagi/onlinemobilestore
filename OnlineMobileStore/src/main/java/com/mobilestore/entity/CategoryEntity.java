package com.mobilestore.entity;



	import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

	@Data
	@Entity
	@Table(name = "category")
	public class CategoryEntity {
		@Id
		@Generated(strategy = GenerationType.IDENTITY, value = { "" })
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

