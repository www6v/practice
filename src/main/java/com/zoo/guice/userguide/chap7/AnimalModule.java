package com.zoo.guice.userguide.chap7;


import com.google.inject.AbstractModule;

public class AnimalModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(String.class).toInstance("Tom");
		
		try {
			bind(Animal.class).toConstructor(Cat.class.getConstructor(String.class));
		} catch (NoSuchMethodException e) {
			addError(e);
		}
		
		System.out.println("run AnimalModule.configure()");
	}
}
