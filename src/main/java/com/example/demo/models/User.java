package com.example.demo.models;

import lombok.Data;

@Data
public class User {

    private long id ;
    private String firstName ;
    private String lastName;
    private String email ;
    private String password ;

    public void login( String email , String password) {

    }
}
