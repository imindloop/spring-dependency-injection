package com.imindloop.springdependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("CH")
@Service("i18nService")
public class I18nMandarinService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Ni hao ma! Xie Xie.";
    }
}
