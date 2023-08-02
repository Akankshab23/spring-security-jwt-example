package com.example.jwt.api.repository;

import com.example.jwt.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer>{
   User findByUserName(String username);
}
