package com.roy._14oop.exam.onlineshop.services;

import com.roy._14oop.exam.onlineshop.entities.Product;

public interface ProductManagementService {

	Product[] getProducts();

	Product getProductById(int productIdToAddToCart);

}
