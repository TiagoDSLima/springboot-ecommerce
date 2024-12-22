package dev.tiago.ecommerce.springboot_ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.tiago.ecommerce.springboot_ecommerce.entites.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
