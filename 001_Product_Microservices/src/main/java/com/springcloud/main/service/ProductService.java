package com.springcloud.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcloud.main.dao.ProductDao;
import com.springcloud.main.entity.ProductEntity;

@Service("productService")
public class ProductService {
	@Autowired
	ProductDao productDao;

	public List getAllProducts() {

		return productDao.getAllProducts();
	}

	public List addProduct(ProductEntity productEntity) {
		return productDao.addProduct(productEntity);
	}

}
