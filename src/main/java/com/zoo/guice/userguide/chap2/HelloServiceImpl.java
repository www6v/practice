package com.zoo.guice.userguide.chap2;

import com.google.inject.Inject;

public class HelloServiceImpl implements HelloService {

	Animal animal;
	
	@Inject
	public HelloServiceImpl(Animal animal) {
		this.animal = animal;
	}
	
	@Override
	public void sayHello() {
		System.out.println(animal.getClass().getSimpleName());
		animal.say();
	}
}
