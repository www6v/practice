package com.zoo.patterns.proxy;

import java.util.concurrent.TimeUnit;

/**
 * 
 * @author <a href="mailto:yankai913@gmail.com">yankai</a>
 * @date 2013-10-11
 */
public class BigImage implements Image {

	public BigImage() {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void show() {
		System.out.println("do show image");
	}
}
