package com.zoo.guice.userguide.chap5;

public class Cat implements Animal {
	
	String name;
	
	public void setName(String name) {
		this.name = name;
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
