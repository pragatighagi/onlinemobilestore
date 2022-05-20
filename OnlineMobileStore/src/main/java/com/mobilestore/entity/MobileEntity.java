
package com.mobilestore.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "mobile")
public class MobileEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mobileId;
	private String mobileName;
	private float mobileCost;
	private String modelNumber;
	private String companyName;

	@Temporal(TemporalType.DATE)
	private Date mfd;

	@ManyToOne
	@JoinColumn(name = "categoryId", referencedColumnName = "categoryId")
	private CategoryEntity category;

}
