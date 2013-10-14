package com.zoo.patterns.singleton;
/**
 * 
 * @author <a href="mailto:yankai913@gmail.com">yankai</a>
 * @date 2013-10-11
 */
public class HungrySingleton {
	
	private static HungrySingleton instance = new HungrySingleton();
	
	private HungrySingleton() {}
	
	public static HungrySingleton getInstance() {
		return instance;
	}
}
