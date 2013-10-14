package com.zoo.patterns.template;
/**
 * 
 * @author <a href="mailto:yankai913@gmail.com">yankai</a>
 * @date 2013-10-14
 */
public abstract class Animal {
	
	void sleep() {
		System.out.println("sleep");
	}
	
	abstract void eat();
}
