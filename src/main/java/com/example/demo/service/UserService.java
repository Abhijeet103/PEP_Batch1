package com.example.demo.service;


import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// it will contain all the core logic

@Service
public class UserService {

    @Autowired
    UserRepository userRepository ;

    // Autowired is responsible for dependcy injection

    List<User> getAllUsers(){
        return userRepository.findAll();
    }

    User getUser(long id){
        return userRepository.findById((int) id).orElseThrow();
    }
}