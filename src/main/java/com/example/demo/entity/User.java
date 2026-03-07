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

    Boolean visible ;

    @Column(nullable = false)
    String password;

    @Column(unique = true, nullable = false)
    String email;

    @OneToMany(cascade = CascadeType.ALL)
    List<Post> posts ;

    @OneToMany(cascade = CascadeType.ALL)
    List<Comment> comments ;

    @OneToMany(cascade = CascadeType.ALL)
    List<Like> likes ;

    @OneToOne(cascade = CascadeType.ALL , mappedBy = "user")
    UserInfo userInfo;
}
