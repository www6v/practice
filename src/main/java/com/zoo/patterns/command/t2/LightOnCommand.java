package com.zoo.patterns.command.t2;

/**
 * @author <a href="mailto:yankai913@gmail.com">yankai</a>
 * @date 2013-10-11
 */
public class LightOnCommand implements Command {
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		this.light.on();
	}
}
