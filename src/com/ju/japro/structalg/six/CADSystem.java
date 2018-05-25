package com.ju.japro.structalg.six;

import static com.ju.japro.common.util.Print.print;

class Shape {
	Shape(int i) {
		print("Shape constructor");
	}

	void dispose() {
		print("Shape dispose");
	}
}

class Circle extends Shape {

	Circle(int i) {
		super(i);
		print("Drawing Circle");
	}

	void dispose() {
		print("Erasing Circle");
		super.dispose();
	}
}

class Triangle extends Shape {

	Triangle(int i) {
		super(i);
		print("Triangle Circle");
	}

	void dispose() {
		print("Erasing Triangle");
		super.dispose();
	}
}

class Line extends Shape {
	private int start, end;

	Line(int start, int end) {
		super(start);
		this.start = start;
		this.end = end;
		print("Drawing Line: " + start + "," + end);
	}

	void dispose() {
		print("Erasing Line : " + start + "," + end);
		super.dispose();
	}
}


public class CADSystem extends Shape{
	private Circle circle;
	private Triangle triangle;
	
	private Line[] lines = new Line[3];
	CADSystem(int i) {
		super(i + 1);
		for (int j = 0; j < lines.length; j++) {
			lines[j] = new Line(j , j + j);
		}
		circle = new Circle(1);
		triangle = new Triangle(1);
		print("CADSystem constructor");
	}
	
	public void dispose() {
		print("CADSystem.dispose()");
		
		triangle.dispose();
		circle.dispose();
		for(int i = lines.length-1;i>=0; i++) {
			lines[i].dispose();
		}
		super.dispose();
	}
	
	public static void main(String[] args) {
		CADSystem x = new CADSystem(47);
		try {
			
		} finally {
			x.dispose();
		}
	}

}