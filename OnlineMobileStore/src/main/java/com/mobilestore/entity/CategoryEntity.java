package com.mobilestore.entity;



	import java.util.List;

import javax.annotation.Generated;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;

	@Data
	@Entity
	@Table(name = "category")
	public class CategoryEntity {
		@Id
		@Generated(strategy = GenerationType.IDENTITY)
		@Column(name = "categoryId")
		private int categoryId;
		@Column(name = "categoryName")
		private String categoryName;

		@OneToMany(mappedBy = "category")
		private List<MobileEntity> mobile;



}

