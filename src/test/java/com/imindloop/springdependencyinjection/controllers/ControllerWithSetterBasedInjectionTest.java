package com.imindloop.springdependencyinjection.controllers;

import com.imindloop.springdependencyinjection.services.GreetingService;
import com.imindloop.springdependencyinjection.services.GreetingServiceEnglish;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ControllerWithSetterBasedInjectionTest {

    ControllerWithSetterBasedInjection controllerWithSetterBasedInjection;

    @BeforeEach
    void setUp() {
        controllerWithSetterBasedInjection = new ControllerWithSetterBasedInjection();
        controllerWithSetterBasedInjection.setGreetingService(new GreetingServiceEnglish());
    }

    @Test
    void getGreeting() {
        System.out.println(controllerWithSetterBasedInjection.getGreeting());
    }
}