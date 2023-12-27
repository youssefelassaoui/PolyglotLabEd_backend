package com.example.demo.models;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@Entity
@Table
@NoArgsConstructor

public class Teacher extends Userk {
    private String speciality ;

    // Subject Teacher Relationship
    @ManyToOne( cascade = CascadeType.ALL)
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    private Subject subject ;
}
