package com.project.ecommercebackend.service;

import com.project.ecommercebackend.exceptions.ProductNotFoundException;
import com.project.ecommercebackend.models.Category;
import com.project.ecommercebackend.models.Product;
import com.project.ecommercebackend.repository.CategoryRepository;
import com.project.ecommercebackend.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("selfProductService")
public class SelfProductService implements ProductService {

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    public SelfProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Product getSingleProduct(long id) throws ProductNotFoundException{
        Optional<Product> p = productRepository.findById(id);
        if(p.isPresent()){
            return p.get();
        }
        throw new ProductNotFoundException("Product not found in our database");
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProduct(Long id, String title, String description, Double price, String categoryTitle) {
        Product p = new Product();
        Optional<Category> currentCat = categoryRepository.findByTitle(categoryTitle);
        if(currentCat.isEmpty()) {
            Category newCat = new Category();
            newCat.setTitle(categoryTitle);
            Category newRow = categoryRepository.save(newCat);
            p.setCategory(newRow);
        }else{
            Category currentCategory = currentCat.get();
            p.setCategory(currentCategory);
        }
        p.setTitle(title);
        p.setDescription(description);
        p.setPrice(price);
        Product saveproduct = productRepository.save(p);
        return saveproduct;
    }
}
