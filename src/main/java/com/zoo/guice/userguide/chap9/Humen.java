package com.zoo.guice.userguide.chap9;

import com.google.inject.ProvidedBy;

@ProvidedBy(HumenProvider.class)
public interface Humen {
	void say();
}
