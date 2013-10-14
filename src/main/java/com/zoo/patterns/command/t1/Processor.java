package com.zoo.patterns.command.t1;
/**
 * 
 * @author <a href="mailto:yankai913@gmail.com">yankai</a>
 * @date 2013-10-11
 */
public class Processor {
	
	public void process(int[] target, Command command) {
		command.exec(target);
	}
 
}
