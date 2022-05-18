package com.example.continues.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.OneToMany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//@ToString
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "categoryId")
    private int categoryId;
    private String categoryName;
//    private String categoryPrice;
    private String product;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "category", referencedColumnName = "categoryId")
//    @JoinColumn(name = "c", referencedColumnName = "categoryId")
    private List<Product> products;


//    public Category() {
//        super();
//
//    }
//
//    public Category(int categoryId, String categoryName, List<Product> products) {
//        super();
//        this.categoryId = categoryId;
//        this.categoryName = categoryName;
//
//    }
//
//    public int getCategoryId() {
//        return categoryId;
//    }
//    public void setCategoryId(int categoryId) {
//        this.categoryId = categoryId;
//    }
//    public String getCategoryName() {
//        return categoryName;
//    }
//    public void setCategoryName(String categoryName) {
//        this.categoryName = categoryName;
//    }

}

//import java.util.List;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.SequenceGenerator;
////import javax.validation.constraints.NotNull;
//
//
//@Entity
//public class Category {
//
//    @Id
//    @SequenceGenerator(name = "category", sequenceName = "category_sequence", initialValue = 10, allocationSize = 1)
//    @GeneratedValue(generator = "category", strategy = GenerationType.SEQUENCE)
//    @Column(name = "categoryid")
//    private long categoryId;
//
////    @NotNull(message="category name is must")
//    @Column(name = "categoryname")
//    private String categoryName;
//
//    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
//    private List<Product> products;


//    public Category() {
//        super();
//
//    }
//
//    public Category(long categoryId, String categoryName, List<Product> products) {
//        super();
//        this.categoryId = categoryId;
//        this.categoryName = categoryName;
//
//    }
//
//    public long getCategoryId() {
//        return categoryId;
//    }
//    public void setCategoryId(long categoryId) {
//        this.categoryId = categoryId;
//    }
//    public String getCategoryName() {
//        return categoryName;
//    }
//    public void setCategoryName(String categoryName) {
//        this.categoryName = categoryName;
//    }
//
//}
