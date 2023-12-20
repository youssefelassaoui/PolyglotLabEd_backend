package com.example.demo.models;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Content {
    private long id;
    private String name;
    private byte[] video;
    private String description;
    private double rate;

}

