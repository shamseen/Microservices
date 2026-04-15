package com.example.product_service.service;

import com.example.product_service.model.Product;
import java.util.List;
import org.springframework.stereotype.Service;

@Service          // Spring: marks as business logic layer; makes it a managed bean
public class ProductService {

  public List<Product> getAllProducts() {
    Product p1 = new Product(1, "prod1");
    Product p2 = new Product(2, "prod2");

    List<Product> list = List.of(p1, p2);
    return list;
  }

  public Product getProductById(int id) {
    return new Product(id, "prod" + id);
  }
}
