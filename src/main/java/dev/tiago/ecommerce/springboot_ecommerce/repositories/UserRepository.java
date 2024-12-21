package dev.tiago.ecommerce.springboot_ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.tiago.ecommerce.springboot_ecommerce.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
