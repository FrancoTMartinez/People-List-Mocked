package com.martinezsoft.peoplelist.service;

import com.martinezsoft.peoplelist.builders.PeopleMockDataBuilder;
import com.martinezsoft.peoplelist.model.People;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


public class PeopleService {
    private PeopleMockDataBuilder peopleMockDataBuilder;
    private List<People> peopleList;

    public PeopleService() {
        this.peopleMockDataBuilder = new PeopleMockDataBuilder();
        peopleList = peopleMockDataBuilder.builMockData();
    }

    public People getPeople(String dni){
        if(peopleList.stream().anyMatch(People -> People.getDni().equals(dni))){
            Optional<People> peopleOptional = peopleList.stream().filter(people -> people.getDni().equals(dni)).findFirst();
            if(peopleOptional.isPresent()){
                return peopleOptional.get();
            }
        }
        //throw new PeopleListException("Employee with id " + dni + " not found");
        return null;
    } //get an specific people

    public List<People> getPeople(){return peopleList;}; //get all people array

    public People addPeople(People people){
        if(peopleList.stream().noneMatch(People -> People.getDni().equals(people.getDni()))){
            peopleList.add(people);
        }
        return people;
    } //add people to array

    public People updatePeople (String dni, People people){
        return people;
    }

    public void deletePeople (String dni){
        if(peopleList.stream().anyMatch(people -> people.getDni().equals(dni))){
            Optional<People> peopleOptional = peopleList.stream().filter(people -> people.getDni().equals(dni)).findFirst();
            peopleOptional.ifPresent(people -> peopleList.remove(people));
        }
    } //delete people from de array
}
