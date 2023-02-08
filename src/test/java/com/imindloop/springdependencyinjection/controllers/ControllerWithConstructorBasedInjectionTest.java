package com.imindloop.springdependencyinjection.controllers;

import com.imindloop.springdependencyinjection.services.GreetingService;
import com.imindloop.springdependencyinjection.services.GreetingServiceEnglish;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ControllerWithConstructorBasedInjectionTest {

    ControllerWithConstructorBasedInjection controllerWithConstructorBasedInjection;

    @BeforeEach
    void setUp() {
        controllerWithConstructorBasedInjection = new ControllerWithConstructorBasedInjection(new GreetingServiceEnglish());
    }

    @Test
    void getGreeting() {
        System.out.println(controllerWithConstructorBasedInjection.getGreeting());
    }
}