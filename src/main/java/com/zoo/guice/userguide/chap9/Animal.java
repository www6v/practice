package com.zoo.guice.userguide.chap9;

import com.google.inject.ImplementedBy;

@ImplementedBy(Cat.class)
public interface Animal {
	void say();
}
