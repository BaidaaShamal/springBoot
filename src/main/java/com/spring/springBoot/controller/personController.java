package com.spring.springBoot.controller;


import com.spring.springBoot.model.Person;
import com.spring.springBoot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/spring")
public class personController {

    @Autowired
    private PersonService personService;

    @GetMapping("/print")
    public  String printName(){
        return "Ali";
    }

    @GetMapping("/persons")
    public ResponseEntity getListperson(){
        return ResponseEntity.ok(personService.getPersonList()) ;
    }


    @GetMapping("/personModel")
    public ResponseEntity getListpersonModel(){
        return ResponseEntity.ok(personService.getPersonModelList()) ;
    }

    @PostMapping("/save")
    public ResponseEntity savePerson(@RequestBody Person p){
        return ResponseEntity.ok(p) ;
    }


    //    http://localhost:8080/spring/printName?n=Ali&age=30
    @PostMapping("/printName")
    public ResponseEntity getName(@RequestParam("n") String name ,
                                  @RequestParam int age){
        return ResponseEntity.ok(
                name + " " + age) ;
    }
}
