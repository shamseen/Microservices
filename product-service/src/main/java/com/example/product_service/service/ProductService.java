package com.example.product_service.service;

import com.example.product_service.model.Product;
import com.example.product_service.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service        // Spring: marks as business logic layer; makes it a managed bean
public class ProductService {
  
  @Autowired    // Spring: dependency injection
  ProductRepository productRepository; 

  /**
   * @param p
   * @return new Product with generated id
   */
  public Product createProduct(Product p) {
    return productRepository.save(p);
  }

  public List<Product> createProductBatch(List<Product> batch) {
    return productRepository.saveAll(batch);
  }

  public List<Product> getAllProducts() {
    return productRepository.findAll();
  }

  public Product getProductById(Long id) {
    var p = productRepository.findById(id); // returns Optional<Product>
    return p.orElse(null); // null if id not found
  }
}
