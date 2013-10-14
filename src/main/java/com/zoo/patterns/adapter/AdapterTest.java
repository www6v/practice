package com.zoo.patterns.adapter;

public class AdapterTest {
	public static void main(String[] args) {
		Target target = new Adapter();
		target.doSomething();
	}
}
