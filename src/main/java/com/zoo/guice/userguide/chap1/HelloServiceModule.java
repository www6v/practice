package com.zoo.guice.userguide.chap1;

import com.google.inject.AbstractModule;

public class HelloServiceModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(HelloService.class).to(HelloServiceImpl.class);
//		bind(HelloServiceImpl.class).to(SubHelloServiceImpl.class);
	}

}
