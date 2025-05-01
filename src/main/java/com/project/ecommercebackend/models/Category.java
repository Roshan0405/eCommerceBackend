package com.project.ecommercebackend.models;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Category extends BaseModel {
    private String title;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Product> products;

    

    public Category() {

    }

    public Category(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    @Override
//    public String toString() {
//        return "Category{" +
//                "title='" + title + '\'' +
//                ", products=" + products +
//                '}';
//    }

    public List<Product> getProducts() {
        return products;
    }
}
