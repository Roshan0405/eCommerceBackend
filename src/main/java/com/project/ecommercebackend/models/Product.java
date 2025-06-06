package com.project.ecommercebackend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@Entity
public class Product extends BaseModel {
    private String title;
    private String description;
    private double price;
    private String imageUrl;
    @ManyToOne
    private Category category;

    public Product() {

    }

    public Product(long id, String title, String description, double price, String imageUrl, Category category) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
        this.category = category;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", imageUrl='" + imageUrl + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
