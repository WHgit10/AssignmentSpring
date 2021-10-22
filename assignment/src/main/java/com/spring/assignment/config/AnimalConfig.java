package com.spring.assignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.assignment.bean.Animal;
import com.spring.assignment.bean.Cat;
import com.spring.assignment.bean.Dog;

@Configuration
public class AnimalConfig {
    @Bean("cat")
    
	public Animal getCat() {
		return new Cat();
	}
	
    @Bean("dog")
	public Animal getDog() {
		
		return new Dog();
	}
}
