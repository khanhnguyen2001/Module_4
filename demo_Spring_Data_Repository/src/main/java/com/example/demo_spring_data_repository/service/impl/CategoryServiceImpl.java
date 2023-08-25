package com.example.demo_spring_data_repository.service.impl;

import com.example.demo_spring_data_repository.model.Category;
import com.example.demo_spring_data_repository.repository.ICategoryRepo;
import com.example.demo_spring_data_repository.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    ICategoryRepo iCategoryRepo;

    @Override
    public List<Category> getAll() {
        return (List<Category>) iCategoryRepo.findAll();
    }

    @Override
    public void save(Category category) {
        iCategoryRepo.save(category);
    }

    @Override
    public void edit(Category category) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Category findById(int id) {
        return iCategoryRepo.findAllById(id).get();
    }
}
