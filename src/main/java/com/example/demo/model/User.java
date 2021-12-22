package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Article>articles = new ArrayList<>();

//   @OneToMany(mappedBy = "user",
//           cascade = CascadeType.ALL,
//           orphanRemoval = true)
//    private List<Article> articles = new ArrayList<>();

}
