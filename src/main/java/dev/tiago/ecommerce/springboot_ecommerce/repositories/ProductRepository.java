package dev.tiago.ecommerce.springboot_ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.tiago.ecommerce.springboot_ecommerce.entites.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
