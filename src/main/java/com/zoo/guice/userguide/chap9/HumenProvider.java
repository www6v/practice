package com.zoo.guice.userguide.chap9;

import com.google.inject.Provider;

public class HumenProvider implements Provider<Humen> {
	@Override
	public Humen get() {
		Humen humen = new Student();
		System.out.println("Provider.get()");
		return humen;
	}
}
