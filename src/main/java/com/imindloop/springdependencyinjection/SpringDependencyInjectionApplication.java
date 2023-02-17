package com.imindloop.springdependencyinjection;

import com.imindloop.springdependencyinjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDependencyInjectionApplication.class, args);
		MyController instanceOfMyController = (MyController) context.getBean("myController");


		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("########## Start Property Based ########################");
		ControllerWithPropertyBasedInjection controllerWithPropertyBasedInjection =
				(ControllerWithPropertyBasedInjection) context.getBean("controllerWithPropertyBasedInjection");

		System.out.println(controllerWithPropertyBasedInjection.getGreeting());
		System.out.println("########## End Property Based ########################");

		System.out.println("########## Start Setter Based ########################");
		ControllerWithSetterBasedInjection controllerWithSetterBasedInjection =
				(ControllerWithSetterBasedInjection) context.getBean("controllerWithSetterBasedInjection");

		System.out.println(controllerWithSetterBasedInjection.getGreeting());
		System.out.println("########## End Setter Based ########################");

		System.out.println("########## Start Constructor Based ########################");
		ControllerWithConstructorBasedInjection controllerWithConstructorBasedInjection =
				(ControllerWithConstructorBasedInjection) context.getBean("controllerWithConstructorBasedInjection");

		System.out.println(controllerWithConstructorBasedInjection.getGreeting());
		System.out.println("########## End Constructor Based ########################");

		System.out.println(instanceOfMyController.sayHello());




	}

}
