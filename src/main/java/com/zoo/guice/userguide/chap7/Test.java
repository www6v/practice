package com.zoo.guice.userguide.chap7;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new AnimalModule());
		Animal cat = injector.getInstance(Animal.class);
		System.out.println(cat);
		cat.say();
	}
}
