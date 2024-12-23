package dev.tiago.ecommerce.springboot_ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.tiago.ecommerce.springboot_ecommerce.entites.OrderItem;
import dev.tiago.ecommerce.springboot_ecommerce.entites.pk.OrderItemPK;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
