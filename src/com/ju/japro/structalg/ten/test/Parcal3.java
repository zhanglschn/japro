package com.ju.japro.structalg.ten.test;

import com.ju.japro.common.util.Print;
import com.ju.japro.structalg.ten.Destination;

public class Parcal3 {
	public Destination getDestination() {
		class PMDestination implements Destination {
			private String label;
			private PMDestination(String label) {
				this.label = label;
			}
			public String readLabel() {
				return label;
			}
		}
		return new PMDestination("Taimins");
	}
	
	public static void main(String[] args) {
		Parcal3 pc = new Parcal3();
		Destination destination = pc.getDestination();
		Print.print(destination.readLabel());
		
	}
}