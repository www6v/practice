package com.zoo.patterns.singleton;
/**
 * 
 * @author <a href="mailto:yankai913@gmail.com">yankai</a>
 * @date 2013-10-11
 */
public class LazySingleton {
	
	private static LazySingleton instance;
	
	private LazySingleton() {}
	
	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
