package com.example.demo;

import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class test {

    @Autowired
    UserRepository userRepository;


    void test(){

       userRepository.findById(1) ;
       userRepository.CustomFunction("abhijeet");
    }



}
