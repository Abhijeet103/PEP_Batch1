package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    String comment ;

    @ManyToOne(cascade = CascadeType.ALL)
            @JoinColumn
    User user;

    @ManyToOne(cascade = CascadeType.ALL)
            @JoinColumn
    Post post;


    LocalDateTime createdAt ;

    @PrePersist
    void prePersist(){
        createdAt = LocalDateTime.now() ;
    }

}
