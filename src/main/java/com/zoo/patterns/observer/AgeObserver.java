package com.zoo.patterns.observer;
/**
 * 
 * @author <a href="mailto:yankai913@gmail.com">yankai</a>
 * @date 2013-10-11
 */
public class AgeObserver implements Observer {

	@Override
	public void update(Observable o, Object obj) {
		if (obj instanceof Number) {
			System.out.println(o + " age has changed! " + obj);
		}
	}
}
