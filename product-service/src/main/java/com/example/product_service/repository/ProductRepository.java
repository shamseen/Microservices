package com.example.product_service.repository;

import com.example.product_service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Spring: marks as data access layer; makes it a managed bean
public interface ProductRepository extends JpaRepository<Product, Long>  {
  // JpaRepository defines findAll, findById, save, delete
}
