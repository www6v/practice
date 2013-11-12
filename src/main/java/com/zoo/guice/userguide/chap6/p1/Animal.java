package com.zoo.guice.userguide.chap6.p1;

import com.google.inject.ImplementedBy;

@ImplementedBy(value = Cat.class)
public interface Animal {
	void say();
}
