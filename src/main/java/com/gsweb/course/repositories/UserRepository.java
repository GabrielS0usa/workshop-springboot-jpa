package com.gsweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gsweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
