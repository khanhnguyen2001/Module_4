package com.demospringmvc.service;

import com.demospringmvc.model.Product;

import java.util.ArrayList;

public class ProductService {
    public ArrayList<Product> products;

    public ProductService() {
        products = new ArrayList<>();
        products.add(new Product(1, 200, "Người yêu Quang", "https://muabanre.net/wp-content/uploads/2023/06/gai-xinh-in4-vsbg-14.jpg"));
        products.add(new Product(2, 200, "Người yêu Minh", "https://gamek.mediacdn.vn/133514250583805952/2021/12/18/photo-1-1639800841076808022272.jpg"));
        products.add(new Product(3, 200, "Người yêu Hảo", "https://voz.vn/attachments/91521840_307101980289524_4067317154385494016_n-png.38616/"));
    }

    public Product findById(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void edit(Product product1) {
        Product product = findById(product1.getId());
        product.setName(product1.getName());
        product.setImg(product1.getImg());
        product.setPrice(product1.getPrice());
    }
}
