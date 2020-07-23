package com.martinezsoft.peoplelist.configuration;

import com.martinezsoft.peoplelist.service.PeopleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

@Configuration

public class PeopleListConfiguration {

    @Bean
    @RequestScope
    public PeopleService peopleService(){return new PeopleService();}
}
