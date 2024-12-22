package dev.tiago.ecommerce.springboot_ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.tiago.ecommerce.springboot_ecommerce.entites.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
