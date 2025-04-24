package com.project.ecommercebackend.service;

import com.project.ecommercebackend.models.Product;

import java.util.List;

public interface ProductService {

    Product getSingleProduct(long id);

    List<Product> getAllProducts();

    Product createProduct(Product product);
}
