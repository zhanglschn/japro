package com.ju.japro.structalg.eight;

import static com.ju.japro.common.util.Print.print;

import com.ju.japro.structalg.seven.music.Note;
abstract class Instrument {
	public abstract void play(Note n);
	public String what(){return "Instrument";}
	public abstract void adjust();
}

class Wind extends Instrument {
	public void play(Note n) {
		print("wind.play() " + n);
	}
	public String what() {return "Wind";}
	public void adjust() {}
}

class Percussion extends Instrument {
	public void play(Note n) {
		print("Percussion.play() " + n);
	}
	public String what() {return "Percussion";}
	public void adjust() {}
}

class Stringed extends Instrument {
	public void play(Note n) {
		print("Stringed.play() " + n);
	}
	public String what() {return "Stringed";}
	public void adjust() {}
}


class Brass extends Wind {
	public void play(Note n) {
		print("Brass.play() " + n);
	}
	public void adjust() {
		print("Brass.adjust()");
	}
}
class Woodwind extends Wind {
	public void play(Note n) {
		print("Woodwind.play() " + n);
	}
	public String what() {return "Woodwind ";}
}

public class Music4 {
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
