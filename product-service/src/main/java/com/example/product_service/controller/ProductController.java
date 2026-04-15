package com.example.product_service.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.product_service.model.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController               // Spring: handles HTTP requests; responses to JSON
@RequestMapping("/products")  // Spring: base path for all endpoints
public class ProductController {

  @GetMapping  // Spring: GET endpoint "/products"
  public Product[] getAllProducts() {
    Product p1 = new Product(1, "prod1");
    Product p2 = new Product(2, "prod2");

    Product[] list = {p1, p2};

    return list;
  }

  @GetMapping("/{id}")
  public Product getProductById(@PathVariable int id) {
    return new Product(id, "prod"+id);
  }
  
}
