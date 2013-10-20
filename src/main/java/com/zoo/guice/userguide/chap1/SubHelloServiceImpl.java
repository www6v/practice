package com.zoo.guice.userguide.chap1;

public class SubHelloServiceImpl extends HelloServiceImpl {

	@Override
	public void sayHello() {
		System.out.println("sub hello");
	}

}
