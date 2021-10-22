package com.spring.assignment.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;


@Data
public class Pet {
	
	private String petname;
	
	@Autowired
	@Qualifier("cat")
	private Animal animal;
	
	@Autowired
	@Qualifier("dog")
    private	Animal animal2;
	

}
