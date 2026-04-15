package com.example.product_service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor      // Lombok: generates all-args constructor
@Getter
@Setter                  // Lombok: generates for all non-static fields
public class Product {
  private int id;
  private String name;
}



