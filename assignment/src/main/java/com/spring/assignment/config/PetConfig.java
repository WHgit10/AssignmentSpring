package com.spring.assignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.assignment.bean.Pet;

@Configuration
public class PetConfig {

	@Bean("pet")
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setPetname("Dog");
		return pet;
	}
	
		
		
		
	}

