package com.educandoewb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoewb.course.entities.OrderItem;
import com.educandoewb.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
