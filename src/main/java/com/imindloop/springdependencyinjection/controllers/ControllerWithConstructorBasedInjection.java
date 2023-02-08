package com.imindloop.springdependencyinjection.controllers;

import com.imindloop.springdependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerWithConstructorBasedInjection {

    private final GreetingService greetingService;

    public ControllerWithConstructorBasedInjection(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
