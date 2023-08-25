package com.example.demo_spring_data_repository.service;

import com.example.demo_spring_data_repository.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService extends IService<Product>{
    void save(Product product, int idCategory);
    Page<Product> getAll(Pageable pageable);

}
