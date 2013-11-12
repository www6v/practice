package com.zoo.guice.userguide.chap6.p2;

import com.google.inject.ProvidedBy;

@ProvidedBy(value = AnimalProvider.class)
public interface Animal {
	void say();
}
