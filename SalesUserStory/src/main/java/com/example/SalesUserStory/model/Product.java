package com.example.SalesUserStory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@NoArgsConstructor
public class Product {
    @Id
    private int productId;
    private String productName;
    private float price;
    private String stockLevel;
    private String replenishLevel;


    public Product(int productId, String productName, float price, String stockLevel, String replenishLevel) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stockLevel = stockLevel;
        this.replenishLevel = replenishLevel;
    }
    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }


}
