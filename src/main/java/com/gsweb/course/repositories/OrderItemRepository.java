package com.gsweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gsweb.course.entities.OrderItem;
import com.gsweb.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>  {

}
