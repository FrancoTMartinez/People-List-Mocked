package com.martinezsoft.peoplelist.builders;

import com.martinezsoft.peoplelist.model.People;

import java.util.ArrayList;
import java.util.List;


public class PeopleMockDataBuilder {
    List<People> peopleMocks;

    public PeopleMockDataBuilder() { this.peopleMocks = new ArrayList<>();}

    public List <People> builMockData(){
        People firstPeople = new People();
        People secondPeople = new People();
        People thirdPeople = new People();

        firstPeople.setDni("42415841");
        firstPeople.setName("Franco Martinez");
        firstPeople.setDate("09/02/00");
        firstPeople.setAdress("Falso 848");
        firstPeople.setEmail("FrancoTobias@gmail.com");
        firstPeople.setPhone("1530870000");

        secondPeople.setDni("18687878");
        secondPeople.setName("Juan Martinez");
        secondPeople.setDate("07/05/00");
        secondPeople.setAdress("Mitre 1211");
        secondPeople.setEmail("falso2@gmail.com");
        secondPeople.setPhone("1530870635");

        thirdPeople.setDni("227504141");
        thirdPeople.setName("Mauro de Martinez");
        thirdPeople.setDate("07/05/00");
        thirdPeople.setAdress("martin fierro 1211");
        thirdPeople.setEmail("falso3@gmail.com");
        thirdPeople.setPhone("1530871111");

        peopleMocks.add(firstPeople);
        peopleMocks.add(secondPeople);
        peopleMocks.add(thirdPeople);

        return peopleMocks;
    }
}
