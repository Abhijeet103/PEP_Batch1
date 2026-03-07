package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;

    @Column(nullable = false)
    String content ;

    String mediaUrl ;

    // FK by defualt is many to one
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    User user ;

}
