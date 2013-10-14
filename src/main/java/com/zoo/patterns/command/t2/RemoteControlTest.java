package com.zoo.patterns.command.t2;

/**
 * @author <a href="mailto:yankai913@gmail.com">yankai</a>
 * @date 2013-10-11
 */
public class RemoteControlTest {
	public static void main(String[] args) {
		Command cmd = new LightOnCommand(new Light());
		SimpleRemoteControl control = new SimpleRemoteControl(cmd);
		control.buttonWasPressed();
	}
}
