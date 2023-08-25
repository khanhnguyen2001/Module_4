package com.example.demo_spring_data_repository.repository;

import com.example.demo_spring_data_repository.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryRepo extends CrudRepository<Category, Integer> {
}
