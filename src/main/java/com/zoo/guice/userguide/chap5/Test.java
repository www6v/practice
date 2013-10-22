package com.zoo.guice.userguide.chap5;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new AnimalModule());
		AnimalProvider provider = injector.getInstance(AnimalProvider.class);
		Animal cat = provider.get();
		System.out.println(cat);
		cat.say();
	}
}
