package com.uptc.tallersergio.persistence.repository;

import com.uptc.tallersergio.persistence.entity.OrderEntity;
import org.springframework.data.repository.ListCrudRepository;



public interface OrderRepository extends ListCrudRepository<OrderEntity, Integer> {
}
