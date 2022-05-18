package com.example.continues.service;

import com.example.continues.Objects.Product;
import com.example.continues.exception.NotFoundException;
import com.example.continues.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    /*public List<Product> getProducts(Pageable pages){
        return productRepository.findAll(pages);
    }*/
    public Product getProduct(int id){
        Optional<Product> product = productRepository.findById(id);
        if(!product.isPresent())
            throw new NotFoundException("Product not available!");
        return product.get();
    }
    public Product addProduct(Product product){
        return productRepository.save(product);
    }
    public Product updateProduct(int id, Product product){
        product.setProductId(id);
        return productRepository.save(product);
    }
    public void deleteProduct(int id){
        productRepository.deleteById(id);

    }

    public List<Product> getProducts(Integer pageNum, Integer pageSize) {
        Pageable pages= PageRequest.of(pageNum,pageSize);
        Page<Product> result=productRepository.findAll(pages);
        if(result.hasContent()){
            return result.getContent();
        }
        else {
            return new ArrayList<>();
        }
    }







}




