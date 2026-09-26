package com.michaelalizade.activity_tracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    long id;
    private String name;
    private String email;
    private String password; //todo: ensure encrypted; must NOT be stored raw. Perform encrypted .equals checks
}
