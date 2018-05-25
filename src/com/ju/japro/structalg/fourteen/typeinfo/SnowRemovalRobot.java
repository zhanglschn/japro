package com.ju.japro.structalg.fourteen.typeinfo;

import java.util.Arrays;
import java.util.List;

import static com.ju.japro.common.util.Print.print;

public class SnowRemovalRobot implements Robot{
	private String name;
	public SnowRemovalRobot(String name) {
		this.name = name;
	}
	public String name() {
		return name;
	}
	public String model() {
		return "SnowBot Series 11";
	}
	
	public List<Operation> operations() {
		return Arrays.asList(new Operation() {
			public String description() {
				return name + " can shovel snow";
			}
			public void command() {
				print(name + "  shoveling snow");
			}
		},new Operation() {
			public String description() {
				return name + " can. chip ice";
			}
			public void command() {
				print(name + " chipping ice");
			}
		}, new Operation() {
			public String description() {
				return name + "  can clear the roof";
			}
			public void command() {
				print(name + " clearing roof");
			}
		});
	}
	
	public static void main(String[] args) {
		Robot.Test.test(new SnowRemovalRobot("Slusher"));
	}
	
}