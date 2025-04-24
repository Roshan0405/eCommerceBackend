package com.project.ecommercebackend.controller;

import com.project.ecommercebackend.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;

@RestController
public class ProductController {

//    @RequestMapping(value = "/Products", method = RequestMethod.POST)
//    @PostMapping is same as above @RequestMapping
    @PostMapping(value = "/products")
    public void createProduct(Product product) {

    }

    @GetMapping(value = "/products/{id}")
    public Product getProductById(@PathVariable("id") long id) {
        return null;
    }

    public void updateProduct(Product product) {

    }

    public void deleteProduct(long id) {

    }
}
