package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;

    @Column(unique = true , nullable = false)
    String username ;

    @Column(nullable = false)
    String password;

    @Column(unique = true, nullable = false)
    String email;

    @OneToMany(cascade = CascadeType.ALL)
    List<Post> posts ;

    @OneToOne(cascade = CascadeType.ALL , mappedBy = "user")
    UserInfo userInfo;
}
