package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@Entity
@Table
public class Admin extends Userk {

    @JsonIgnore
    @OneToMany(mappedBy = "admin")
    List<Content> adminContents ;
}
