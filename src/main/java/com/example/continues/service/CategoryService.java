package com.example.continues.service;

import com.example.continues.Objects.Category;
import com.example.continues.exception.NotFoundException;
import com.example.continues.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getCategories(){
        return categoryRepository.findAll();
    }
    public Category getCategory(int id){
        Optional<Category> category = categoryRepository.findById(id);
        if(!category.isPresent())
            throw new NotFoundException("Category not found!");
        return category.get();
    }
    public Category addCategory(Category category){
        return categoryRepository.save(category);
    }
    public Category updateCategory(int id, Category category){
        category.setCategoryId(id);
        return categoryRepository.save(category);
    }
    public void deleteCategory(int id){
        categoryRepository.deleteById(id);
    }
}

