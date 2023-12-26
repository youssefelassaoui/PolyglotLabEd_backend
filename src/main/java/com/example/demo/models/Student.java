package com.example.demo.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student extends  User {
    private String speciality ;

    @ManyToOne(cascade = CascadeType.ALL) // many student in this semester
    @JoinColumn(name = "teacher_id", referencedColumnName = "id") // refers to the foreign key that it will be added to the student table and referneced column refers to reference by in sql
    private Semester semester ;

    private Level level ;
}
