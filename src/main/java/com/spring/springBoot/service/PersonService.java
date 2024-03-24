package com.spring.springBoot.service;

import com.spring.springBoot.model.Person;
import com.spring.springBoot.model.PersonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PersonService {

    @Autowired
    private PersonModel personModel;
    public String printMyname(String n) {
        return  n.toUpperCase();
    }

    public List<Person> getPersonList() {
     ArrayList<Person> list=new ArrayList<>();
       list.add(new Person("ali"));
        list.add(new Person("ahmed"));
        list.add(new Person("nada"));
        return list;  }

    public List<Person> getPersonModelList() {
        List<Person> list=personModel.getList();
        return list;  }


}





