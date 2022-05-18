package com.example.continues.Objects;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import javax.persistence.*;

@Entity

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "productId")
    private int productId;
    private String productName;
    private int productPrice;

//    private int categoryId;





    public Product() {

    }

    public Product(int productId, String productName, int productPrice) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
//        this.categoryId = categoryId;
    }
//
//    method

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

//    public Category getcategory() {
//        return Category;
//    }
//
//    public void setCategory(Category category) {
//        this.Category = category;
//    }
//public int getcategoryId() {
//    return categoryId;
//}
//
//    public void setcategoryId(int categoryId) {
//        this.categoryId = categoryId;
//    }

}

