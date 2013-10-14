package com.zoo.patterns.factory;
/**
 * 
 * @author <a href="mailto:yankai913@gmail.com">yankai</a>
 * @date 2013-10-11
 */
public class AbstractFacotry {
	
	public static Factory getFacotry(String type) {
		if (type.equals("simple")) {
			return new SimpleFactory();
		} else {
			// other factory.
			return new Factory() {
				public Object getProductObject() {
					return null;
				}
			};
		}
	}
}
