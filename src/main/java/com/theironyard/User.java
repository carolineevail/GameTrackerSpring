package com.theironyard;

import javax.persistence.*;

/**
 * Created by Caroline on 3/9/16.
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }
}