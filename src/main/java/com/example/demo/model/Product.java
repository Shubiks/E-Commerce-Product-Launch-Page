package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String productName;
    private String description;
    private Double price;
    private Double discount;
    private Double finalPrice;
    private Integer stockQuantity;
    private Double ratingAverage;
    private Integer soldRate;
    private String imageUrl; // New field
    private Integer numberOfReviews; // New field
    private String deliveryDate; // New field

    // Getters and Setters

    public Long getProductId() {
        return productId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getDiscount() {
        return discount;
    }
    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    public Double getFinalPrice() {
        return finalPrice;
    }
    public void setFinalPrice(Double finalPrice) {
        this.finalPrice = finalPrice;
    }
    public Integer getStockQuantity() {
        return stockQuantity;
    }
    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
    public Double getRatingAverage() {
        return ratingAverage;
    }
    public void setRatingAverage(Double ratingAverage) {
        this.ratingAverage = ratingAverage;
    }
    public Integer getSoldRate() {
        return soldRate;
    }
    public void setSoldRate(Integer soldRate) {
        this.soldRate = soldRate;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public Integer getNumberOfReviews() {
        return numberOfReviews;
    }
    public void setNumberOfReviews(Integer numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }
    public String getDeliveryDate() {
        return deliveryDate;
    }
    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    // Additional Methods
    @Transient
    public String getStockAvailability() {
        return stockQuantity > 0 ? "In Stock" : "Out of Stock";
    }
}
