package com.zoo.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:yankai913@gmail.com">yankai</a>
 * @date 2013-10-11
 */
public abstract class Observable {
	
	List<Observer> observers = new ArrayList<Observer>();
	
	public void registObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	
	public void notifyObservers(Object obj) {
		for (Observer o : observers) {
			o.update(this, obj);
		}
	}
	
}
