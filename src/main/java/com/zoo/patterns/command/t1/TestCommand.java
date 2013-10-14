package com.zoo.patterns.command.t1;
/**
 * 
 * @author <a href="mailto:yankai913@gmail.com">yankai</a>
 * @date 2013-10-11
 */
public class TestCommand {
	public static void main(String[] args) {
		Processor processor = new Processor();
		int[] target = new int[]{1, 2, 3, 4};
		processor.process(target, new Command() {
			@Override
			public void exec(int[] target) {
				for (int a : target) {
					System.out.println(a);
				}
			}
		});
		
		processor.process(target, new Command() {
			@Override
			public void exec(int[] target) {
				//TODO others
			}
		});
	}
}
