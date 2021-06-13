package com.example.demo.pageable.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="Product")
@Component
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pID")
	private Integer pID;
	
	@Column(name="pNname")
	private String pNname;
	
	@Column(name="pPrice")
	private Integer pPrice;
	
	@Column(name="pQuantity")
	private Integer pQuantity;
	
	public String getpNname() {
		return pNname;
	}
	public void setpNname(String pNname) {
		this.pNname = pNname;
	}
	public Integer getpPrice() {
		return pPrice;
	}
	public void setpPrice(Integer pPrice) {
		this.pPrice = pPrice;
	}
	public Integer getpQuantity() {
		return pQuantity;
	}
	public void setpQuantity(Integer pQuantity) {
		this.pQuantity = pQuantity;
	}
	public Integer getpID() {
		return pID;
	}
	public void setpID(Integer pID) {
		this.pID = pID;
	}

	
	

}
