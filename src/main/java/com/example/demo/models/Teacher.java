package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;


@Entity
@Table
@NoArgsConstructor

public class Teacher extends Userl {
    private String speciality ;
}
