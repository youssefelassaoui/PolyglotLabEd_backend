package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Semester {
    private long id ;
    private int number;
    @JsonIgnore
    @OneToMany(mappedBy = "semester")
    private List<Student> semesterStudents ;


    // GETTER & SETTER
}
