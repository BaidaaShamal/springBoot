package com.spring.springBoot.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonModel {


    List<Person> personList =new ArrayList<>();

    PersonModel(){
        personList.add(Person.builder()
                .id(1)
                .name("nada")
                .age(20)
                .build());
        personList.add(Person.builder()
                .id(2)
                .name("Ali")
                .age(18)
                .build());
    }

    public List<Person> getList(){
        return personList;
    }

}
