package com.zoo.guice.userguide.chap2;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class HelloServiceModule2 extends AbstractModule {

	@Override
	protected void configure() {
		bind(Animal.class).to(Cat.class);
		bind(Animal.class).annotatedWith(Names.named("Snoopy")).to(Dog.class);
		bind(HelloService.class).to(HelloServiceImpl2.class);
	}

}
