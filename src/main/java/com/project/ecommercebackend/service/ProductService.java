package com.project.ecommercebackend.service;

import com.project.ecommercebackend.exceptions.ProductNotFoundException;
import com.project.ecommercebackend.models.Product;

import java.util.List;

public interface ProductService {

    Product getSingleProduct(long id) throws ProductNotFoundException;

    List<Product> getAllProducts();

    Product createProduct(Long id, String title, String description, Double price, String category);
}
