package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

   @Autowired
    UserService userService;

    @GetMapping("/home")
    String fun(){
       return """
               <!DOCTYPE html>
               <html lang="en">
               <head>
                   <meta charset="UTF-8">
                   <title>My First Webpage</title>
               </head>
               <body>
                   <h1>Welcome to My Website</h1>
                   <p>This is my first paragraph of text.</p>
                   <a href="https://www.example.com">Visit an Example Website</a>
               </body>
               </html>
             
               """ ;
    }

    @GetMapping("/user")
    void getUser(@RequestParam String email){

        System.out.println(email);
//        return userService.findAll()  ;
    }

    @GetMapping("/user/{id}")
    User getOneUser(@PathVariable Integer id) {
        return userService.findById(id);
    }


    @PostMapping("/user")
    UserRequest createrUser(@RequestBody UserRequest userRequest){
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getPassword());
        System.out.println(userRequest.getName());

        return userRequest ;
    }


}
