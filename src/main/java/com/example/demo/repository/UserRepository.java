package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {


    List<User> findByVisible(Boolean visible);
    List<User> findByUsername(String username);
}
