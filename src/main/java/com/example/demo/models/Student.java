package com.example.demo.models;
import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@Entity
@Table
public class Student extends Userk {

    // Student Semester relationship
    @ManyToOne(cascade = CascadeType.ALL) // many student in this semester
    @JoinColumn(name = "semester_id", referencedColumnName = "id") // refers to the foreign key that it will be added to the student table and referneced column refers to reference by in sql
    private Semester semester;

    // Student Level relationship

    @ManyToOne(cascade = CascadeType.ALL)// Many student can envoleved in one level
    @JoinColumn(name = "level_id" , referencedColumnName = "id")
    private Level level ;
}

