package com.example.demo_spring_data_repository.service.impl;

import com.example.demo_spring_data_repository.model.Product;
import com.example.demo_spring_data_repository.repository.ICategoryRepo;
import com.example.demo_spring_data_repository.repository.ProductRepo;
import com.example.demo_spring_data_repository.service.ICategoryService;
import com.example.demo_spring_data_repository.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    ICategoryRepo iCategoryRepo;

    @Autowired
    ProductRepo productRepo;

    @Override
    public void save(Product product, int idCategory) {

    }

    @Override
    public Page<Product> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void edit(Product product) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Product findById(int id) {
        return null;
    }
}
