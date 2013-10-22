package com.zoo.guice.userguide.chap3;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new ConfigureModule());
		Configure configure = injector.getInstance(Configure.class);
		System.out.println(configure);
	}
}
