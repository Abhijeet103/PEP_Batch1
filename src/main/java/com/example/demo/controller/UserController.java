package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    UserService userService;


//    @GetMapping()
//    void test(){
//        System.out.println("test");
//    }
//
//    @GetMapping("/test")
//    void test1(){
//        System.out.println("test1");
//    }
//
//    @PostMapping()
//    void test2(){
//        System.out.println("test2");
//    }

    @GetMapping()
    List<User> findAll(){
        return  userService.findAll() ;
    }

    @GetMapping("/{id}")
    User findOne(@PathVariable Integer id){
        return userService.findById(id);
    }

    @PostMapping()
    User create(@RequestBody User user){
        return userService.create(user);
    }



}
