package com.example.demo.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table( name = "history")
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    @ManyToOne
    @JoinColumn( name = "user_id")
    private Userk user ;

    @ManyToOne
    @JoinColumn( name = "content_id" )
    private Content content ;

    private LocalDateTime seenDateTime ;


}
