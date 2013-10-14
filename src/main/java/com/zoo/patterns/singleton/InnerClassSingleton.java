package com.zoo.patterns.singleton;
/**
 * 
 * @author <a href="mailto:yankai913@gmail.com">yankai</a>
 * @date 2013-10-11
 */
public class InnerClassSingleton {

	private InnerClassSingleton() {}
	
	public static InnerClassSingleton getInstance() {
		return InnerClassSingleton_Holder.instance;
	}
	
	static class InnerClassSingleton_Holder {
		private static InnerClassSingleton instance = new InnerClassSingleton();
	}
}
