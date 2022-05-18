package com.example.continues.controllers;

import com.example.continues.Objects.Category;
import com.example.continues.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> getCategories(){
        return categoryService.getCategories();
    }
    @GetMapping("/{Id}")
    public Category getCategory(@PathVariable int Id){
        return categoryService.getCategory(Id);
    }
    @PostMapping
    public Category addCategory(@RequestBody Category category){
        return categoryService.addCategory(category);
    }
    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable int id, @RequestBody Category category){
        return categoryService.updateCategory(id,category);}
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable int id){
        categoryService.deleteCategory(id);
    }

}
