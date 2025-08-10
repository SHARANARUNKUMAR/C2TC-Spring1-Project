package com.example.mallmanagement.service;

import com.example.mallmanagement.entity.OrderEntity;
import com.example.mallmanagement.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository repo;

    public OrderService(OrderRepository repo) {
        this.repo = repo;
    }

    public List<OrderEntity> findAll() {
        return repo.findAll();
    }

    public Optional<OrderEntity> findById(Long id) {
        return repo.findById(id);
    }

    public OrderEntity save(OrderEntity order) {
        return repo.save(order);
    }

    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}