package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String name;

    @Column(name = "age")
    private int age;

   @OneToMany(mappedBy = "user",
           cascade = CascadeType.ALL,
           orphanRemoval = true)
    private List<Article> articles = new ArrayList<>();

}
