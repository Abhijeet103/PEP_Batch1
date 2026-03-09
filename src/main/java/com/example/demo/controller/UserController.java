package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {



    @GetMapping()
    void test(){
        System.out.println("test");
    }

    @PostMapping()
    void test1(){
        System.out.println("test1");
    }

    @GetMapping("/test2")
    void test2(){
        System.out.println("test2");
    }


}
