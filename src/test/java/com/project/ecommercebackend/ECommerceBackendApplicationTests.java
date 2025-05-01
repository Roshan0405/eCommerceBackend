package com.project.ecommercebackend;

import com.project.ecommercebackend.models.Category;
import com.project.ecommercebackend.models.Product;
import com.project.ecommercebackend.repository.CategoryRepository;
import com.project.ecommercebackend.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ECommerceBackendApplicationTests {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    @Test
    void contextLoads() {
    }

    @Test
    void fetchTypeTest(){
        Category cat = categoryRepository.findById(1L).get();
        System.out.println(cat.getId());
        System.out.println("We are done here");

        List<Product> currentProduct = cat.getProducts();
        System.out.println(currentProduct.size());

        System.out.println("We got the products as well");
    }

}
