package com.ju.japro.structalg.seven.music;

public class Music {
	public static void tune(Instrument it) {
		it.play(Note.MIDDLE_C);
	}
	
	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute);
	}
}