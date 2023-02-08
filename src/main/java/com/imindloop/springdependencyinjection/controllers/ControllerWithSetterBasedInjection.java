package com.imindloop.springdependencyinjection.controllers;

import com.imindloop.springdependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerWithSetterBasedInjection {

    @Qualifier("greetingServiceGerman")
    @Autowired
    private GreetingService greetingService;

    public void setGreetingService(@Qualifier("greetingServiceGerman") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
