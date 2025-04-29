package com.project.ecommercebackend.repository;

import com.project.ecommercebackend.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByDescription(String description);

    Product findByTitle(String title);

    Product save(Product product);




}
