package com.imindloop.springdependencyinjection.controllers;

import com.imindloop.springdependencyinjection.services.GreetingService;
import com.imindloop.springdependencyinjection.services.GreetingServiceEnglish;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyBasedInjectionTest {

    ControllerWithPropertyBasedInjection controller;

    @BeforeEach
    void setUp() {
        controller = new ControllerWithPropertyBasedInjection();
        controller.greetingService = new GreetingServiceEnglish();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.greetingService.sayGreeting());
    }
}