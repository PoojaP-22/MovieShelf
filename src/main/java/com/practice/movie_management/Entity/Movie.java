package com.practice.movie_management.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movies")
public class Movie {
    @Id
    //Auto generated id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Integer id;

    private int id; //Manual
    private String title;
    private String director;
    private double rating;
    private String email;

    private String password;
}
