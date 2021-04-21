package com.microservices;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Proyecto20042021MicroserviciosApplication {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(Proyecto20042021MicroserviciosApplication.class, args);
		
		Arrays.sort(context.getBeanDefinitionNames());
		
		for(String name: context.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}
