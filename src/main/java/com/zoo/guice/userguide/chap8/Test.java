package com.zoo.guice.userguide.chap8;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector();
		System.out.println(injector);
	}
}
