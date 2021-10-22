package com.spring.assignment.bean;

public class Dog implements Animal {

	@Override
	public void eat() {
        System.out.println("dot eats chicken");
	}

	@Override
	public void speak() {
          System.out.println("Beagle barks");
	}

}
