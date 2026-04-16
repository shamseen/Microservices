package com.example.product_service.repository;

import com.example.product_service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Spring: marks as data access layer; makes it a managed bean
public interface ProductRepository extends JpaRepository<Product, Long>  {
  /**
   * JpaRepository defines findAll, findById, save, delete
   * 
   * findById() - returns Optional<Product>, not Product directly
   *  - use .orElse(null) or .orElseThrow() to unwrap
   * save() - arg w null id = create new object + INSERT
   *  - generates new id via JPA annotation
   * saveAll() - creates multiple new entities
   */
}
