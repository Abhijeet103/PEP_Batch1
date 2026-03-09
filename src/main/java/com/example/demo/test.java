package com.example.demo;

import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class test {

    @Autowired
    UserRepository userRepository;


    void test(){

        userRepository.findById(1);
        userRepository.CustomFunction("Abhijeet") ;

//        select * from user where id =1
        // these are inbuilt in jpa

    }



}
