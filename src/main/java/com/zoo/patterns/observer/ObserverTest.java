package com.zoo.patterns.observer;
/**
 * 
 * @author <a href="mailto:yankai913@gmail.com">yankai</a>
 * @date 2013-10-11
 */
public class ObserverTest {
	public static void main(String[] args) {
		SubjectCat cat = new SubjectCat(1, "tom");
		cat.registObserver(new AgeObserver());
		cat.registObserver(new NameObserver());
		cat.setAge(2);
		cat.setName("jetty");
	}
}
