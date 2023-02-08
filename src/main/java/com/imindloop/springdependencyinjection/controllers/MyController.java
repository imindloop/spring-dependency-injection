package com.imindloop.springdependencyinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {

        System.out.println("From inside the sayHello() method.");

        return "Hello from MyController.sayHello()";
    }

}
