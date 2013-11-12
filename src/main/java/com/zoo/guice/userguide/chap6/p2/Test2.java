package com.zoo.guice.userguide.chap6.p2;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test2 {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new AnimalModule2());
		Animal cat_A = injector.getInstance(Animal.class);
		System.out.println(cat_A);
		Animal cat_B = injector.getInstance(Animal.class);
		System.out.println(cat_B);
	}
}
