package com.spring.springBoot.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {

    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person( String name) {
        this.name = name;
    }

    // Default constructor
    public Person() {
    }

}
