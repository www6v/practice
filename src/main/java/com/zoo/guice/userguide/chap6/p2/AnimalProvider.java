package com.zoo.guice.userguide.chap6.p2;

import com.google.inject.Provider;

public class AnimalProvider implements Provider<Animal>{

	public Animal get() {
		System.out.println("run Provider.get()");
		return new Cat();
	}
}
