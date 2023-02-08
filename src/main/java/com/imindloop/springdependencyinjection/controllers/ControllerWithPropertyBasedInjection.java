package com.imindloop.springdependencyinjection.controllers;

import com.imindloop.springdependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerWithPropertyBasedInjection {

    @Qualifier("greetingServiceEnglish")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
