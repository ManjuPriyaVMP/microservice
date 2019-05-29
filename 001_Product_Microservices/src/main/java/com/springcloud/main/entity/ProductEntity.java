package com.springcloud.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String name;
	@Column
	private double price;
	@Column
	private Boolean stockStatus;
	
	
	public ProductEntity() {
		
	}
	public ProductEntity(long id, String name, double price, Boolean stockStatus) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.stockStatus = stockStatus;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Boolean getStockStatus() {
		return stockStatus;
	}
	public void setStockStatus(Boolean stockStatus) {
		this.stockStatus = stockStatus;
	}
	
	
	
}
