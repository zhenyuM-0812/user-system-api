package com.example.usersystemapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable=false,length=200)
    private String lastName;

    @Column(nullable=false,length=200)
    private String firstName;

    @Column(nullable=false)
    private Integer age;

    @Column(nullable=false)
    private String department;

}
