package com.imindloop.springdependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceGerman implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hallo in German.";
    }
}
