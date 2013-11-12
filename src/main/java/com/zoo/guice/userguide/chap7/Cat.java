package com.zoo.guice.userguide.chap7;


public class Cat implements Animal {
	
	String name;
	
	public Cat(String name) {
		this.name = name;
		System.out.println("run Cat.constructor()");
	}
	
	@Override
	public void say() {
		System.out.println("i am a cat");
	}
	
	@Override
	public String toString() {
		return "name==>" + this.name;
	}
}
