package com.project.ecommercebackend.controller;

import com.project.ecommercebackend.exceptions.ProductNotFoundException;
import com.project.ecommercebackend.models.Product;
import com.project.ecommercebackend.service.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(@Qualifier("selfProductService") ProductService productService) {
        this.productService = productService;
    }

//    @RequestMapping(value = "/Products", method = RequestMethod.POST)
//    @PostMapping is same as above @RequestMapping
    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        Product p = productService.createProduct(product.getId(),
                product.getTitle(), product.getDescription(),
                product.getPrice(), product.getCategory().getTitle());

        return p;
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") long id) throws ProductNotFoundException {
        System.out.println("Starting the api here");
        Product p = productService.getSingleProduct(id);
        System.out.println("Ending the api here");

        ResponseEntity<Product> response = new ResponseEntity<>(
                p, HttpStatus.OK
        );

        return response;
    }

    public void updateProduct(Product product) {

    }

    public void deleteProduct(long id) {

    }
}
