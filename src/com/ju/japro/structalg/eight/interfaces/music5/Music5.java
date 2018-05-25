package com.ju.japro.structalg.eight.interfaces.music5;

import static com.ju.japro.common.util.Print.print;
import com.ju.japro.structalg.seven.music.Note;

interface Instrument {
	int VALUE = 5;

	void play(Note n);

	void adjust();
}

class Wind implements Instrument {
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public void adjust() {
		print(this + ".adjust()");
	}

	public String toString() {
		return "Wind";
	}
}

class Percussion implements Instrument {
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Percussion";
	}

	public void adjust() {
		print(this + ".adjust()");
	}
}

class Stringed implements Instrument {
	public void play(Note n) {
		print(this + ".play() " + n);
	}
	public String toString() {
		return "Stringed";
	}
	public void adjust() {
		print(this + ".adjust()");
	}
}

class Brass extends Wind {
	public String toString() {
		return "Brass";
	}
}

class Woodwind extends Wind {
	public String toString() {
		return "Woodwind";
	}
}



public class Music5 {
	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	static void tuneAll(Instrument[] e) {
		for (Instrument i : e) {
			tune(i);
		}
	}
	public static void main(String[] args) {
		Instrument[] orchestra = {new Wind(),new Percussion(),new Stringed(),new Brass(),new Woodwind()};
		tuneAll(orchestra);
	}
}