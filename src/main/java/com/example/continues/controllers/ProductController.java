package com.example.continues.controllers;

import com.example.continues.Objects.Product;
import com.example.continues.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.continues.service.ProductService;


import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProducts(@RequestParam(required = false,defaultValue = "0") Integer pageNum,@RequestParam(required = false,defaultValue = "5") Integer pageSize)
    {


        return productService.getProducts(pageNum,pageSize);
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id) {
        return productService.getProduct(id);
    }





    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @PutMapping("/{id}")
    public Product addProduct(@PathVariable int id, @RequestBody Product product) {
        return productService.updateProduct(id,product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);



}



}




