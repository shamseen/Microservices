package com.example.product_service.controller;

import com.example.product_service.model.Product;
import com.example.product_service.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController               // Spring: handles HTTP requests; responses to JSON
@RequestMapping("/products")  // Spring: base path for all endpoints
public class ProductController {

  @Autowired    // Spring: dependency injection
  private ProductService productService;

  @GetMapping  // Spring: GET endpoint "/products"
  public List<Product> getAllProducts() {
    return productService.getAllProducts();
  }

  @GetMapping("/{id}")
  public Product getProductById(@PathVariable int id) {
    return productService.getProductById(id);
  }
  
}
