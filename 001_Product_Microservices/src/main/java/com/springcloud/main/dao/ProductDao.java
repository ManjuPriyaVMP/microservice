package com.springcloud.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springcloud.main.entity.ProductEntity;
import com.springcloud.main.repository.ProductRepository;
@Repository
public class ProductDao {

	@Autowired
	private ProductRepository repository;

	public List getAllProducts() {
		return repository.findAll();
	}

	public List addProduct(ProductEntity entity) {
		// TODO Auto-generated method stub
		repository.save(entity);
		return repository.findAll() ;
	}

}
