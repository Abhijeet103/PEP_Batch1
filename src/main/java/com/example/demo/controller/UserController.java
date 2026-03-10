package com.example.demo.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {


    @GetMapping("/user")
    String fun(@RequestParam String name , @RequestParam boolean isAdmin){
        if(isAdmin){
            return "Hello Admin " + name;
        }
       return "Hello User  " + name;
    }

    @GetMapping("/user/{id}")
    String fun1(@PathVariable int id){

        return "Hello User " + id ;
    }

    @PostMapping("/user")
    ResponseEntity<UserRequest> fun2(@RequestBody UserRequest userRequest  , @RequestHeader("Authorization") String token){
        try {
            System.out.println(userRequest);
            userRequest.setName("Abhijeet");
            return new ResponseEntity<>(userRequest, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }


}
