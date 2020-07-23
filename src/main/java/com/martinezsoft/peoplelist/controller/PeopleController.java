package com.martinezsoft.peoplelist.controller;


import com.martinezsoft.peoplelist.model.People;
import com.martinezsoft.peoplelist.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/services/employees")

public class PeopleController {

    private final PeopleService peopleService;

    @Autowired
    public PeopleController(PeopleService peopleService){
        this.peopleService = peopleService;
    }

    @PostMapping(value = "/add", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity <People> addPeople(@RequestBody People people){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(peopleService.addPeople(people));
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<People>> searchPeople(){
        return ResponseEntity.status(HttpStatus.OK).body(peopleService.getPeople());
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<People> lookupPeople(@PathVariable String dni){
        return ResponseEntity.status(HttpStatus.OK).body(peopleService.getPeople(dni));
    }

    @PutMapping(value = "/update/{id}", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<People> updatePeople(@PathVariable String dni, @RequestBody People people){
        return ResponseEntity.status(HttpStatus.OK).body(peopleService.updatePeople(dni, people));
    }

   @DeleteMapping(value = "/{id}", produces =  APPLICATION_JSON_VALUE)
   public ResponseEntity<String> deletePeople(@PathVariable String dni){
        return ResponseEntity.status(HttpStatus.OK).body("People deleted");
   }

}
