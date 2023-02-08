package com.imindloop.springdependencyinjection.controllers;

import com.imindloop.springdependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerWithConstructorBasedInjection {

    @Qualifier("greetingServiceItalian")
    private final GreetingService greetingService;

    public ControllerWithConstructorBasedInjection(@Qualifier("greetingServiceItalian") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
