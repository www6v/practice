package com.zoo.guice.userguide.chap9;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector();
		Animal animal = injector.getInstance(Animal.class);
		System.out.println(animal.getClass().getSimpleName());
		animal.say();
		Humen humen = injector.getInstance(Humen.class);
		System.out.println(humen.getClass().getSimpleName());
		humen.say();
	}
}
