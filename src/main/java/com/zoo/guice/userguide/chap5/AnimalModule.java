package com.zoo.guice.userguide.chap5;

import com.google.inject.AbstractModule;

public class AnimalModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(String.class).toInstance("Tom");
		bind(Animal.class).toProvider(AnimalProvider.class);
		System.out.println("run AnimalModule.configure()");
	}
}
