package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Repository
public interface ProductRepository {
    List<Product> getAllProducts();
    Product getProductById(String productId);
    List<Product> getProductsByCategory(String category);
    Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
}
