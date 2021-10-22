package com.spring.assignment.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.assignment.bean.Pet;
import com.spring.assignment.config.AllConfig;

public class Test {
public static void main(String[] args) {
	
	ApplicationContext context= new AnnotationConfigApplicationContext(AllConfig.class);
	Pet pet=(Pet) context.getBean("pet");
	pet.getAnimal().eat();
	pet.getAnimal().speak();
	
	pet.getAnimal2().eat();
	pet.getAnimal2().speak();
	
}
}
