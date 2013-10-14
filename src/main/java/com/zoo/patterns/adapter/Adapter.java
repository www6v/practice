package com.zoo.patterns.adapter;

/**
 * @author <a href="mailto:yankai913@gmail.com">yankai</a>
 * @date 2013-10-11
 */
public class Adapter extends Provider implements Target {
	
	public Adapter() {
		
	}
	
	@Override
	public void doSomething() {
		super.doOthers();
	}
}
