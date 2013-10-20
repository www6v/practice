package com.zoo.guice.userguide.chap1;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Test {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new HelloServiceModule());
		HelloService helloService = injector.getInstance(HelloService.class);
		System.out.println(helloService.getClass().getSimpleName());
		helloService.sayHello();
	}
}
