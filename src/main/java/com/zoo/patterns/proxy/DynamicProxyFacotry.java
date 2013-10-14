package com.zoo.patterns.proxy;

import java.lang.reflect.Proxy;
/**
 * 
 * @author <a href="mailto:yankai913@gmail.com">yankai</a>
 * @date 2013-10-11
 */
public class DynamicProxyFacotry {

	 public static Object factory(Object obj){  
		 Class<?> clazz = obj.getClass();
		 return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new MyInvocationHandler(obj));
	 }
}
