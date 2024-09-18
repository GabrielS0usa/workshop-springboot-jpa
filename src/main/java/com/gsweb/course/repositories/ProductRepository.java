package com.gsweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gsweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {

}
