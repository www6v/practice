package com.zoo.patterns.command.t2;

/**
 * @author <a href="mailto:yankai913@gmail.com">yankai</a>
 * @date 2013-10-11
 */
public class SimpleRemoteControl {
	Command slot;
	
	public SimpleRemoteControl(Command slot) {
		this.slot = slot;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
}
