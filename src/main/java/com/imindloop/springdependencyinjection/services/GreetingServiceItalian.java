package com.imindloop.springdependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceItalian implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Ciao in Italian.";
    }
}
