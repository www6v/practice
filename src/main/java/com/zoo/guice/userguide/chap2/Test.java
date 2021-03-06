package com.zoo.guice.userguide.chap2;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new HelloServiceModule());
		HelloService helloService = injector.getInstance(HelloService.class);
		helloService.sayHello();
	}
}
