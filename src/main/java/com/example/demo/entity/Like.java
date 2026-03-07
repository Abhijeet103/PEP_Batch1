package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tools.jackson.databind.annotation.EnumNaming;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;

    @ManyToOne(cascade = CascadeType.ALL)
            @JoinColumn
    User user ;

    @ManyToOne(cascade = CascadeType.ALL)
            @JoinColumn
    Post post ;


    LocalDateTime createdAt ;

    @PrePersist
    void prePersist(){
        createdAt = LocalDateTime.now() ;
    }
}
