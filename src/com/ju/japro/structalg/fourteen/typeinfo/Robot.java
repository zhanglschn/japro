package com.ju.japro.structalg.fourteen.typeinfo;

import java.util.List;

import com.ju.japro.util.Null;

import static com.ju.japro.common.util.Print.print;

public interface Robot {
	String name();
	String model();
	List<Operation> operations();
	class Test {
		public static void test(Robot r) {
			if (r instanceof Null) {
				print("Null Rebot");
			}
			print("Robot name : " + r.name());
			print("Robot model : " + r.model());
			for (Operation operation : r.operations()) {
				print(operation.description());
				operation.command();
			}
		}
	}
}