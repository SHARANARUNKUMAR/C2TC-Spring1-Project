package com.example.mallmanagement.repository;

import com.example.mallmanagement.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> 
{
}