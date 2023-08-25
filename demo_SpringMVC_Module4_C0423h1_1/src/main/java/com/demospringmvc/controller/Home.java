package com.demospringmvc.controller;

import com.demospringmvc.model.Product;
import com.demospringmvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Home {
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public String home(Model model){
        model.addAttribute("products", productService.products);
        return "home";
    }

    @GetMapping("/products/edit")
    public String showEdit(@RequestParam int id, Model model){
        model.addAttribute("product",productService.findById(id));
        return "edit";
    }

    @PostMapping("/products/edit")
    public String edit(@RequestParam int id,String name, String img, int price){
        productService.edit(new Product(id,price,name,img));
        return "redirect:/products";
    }
}
