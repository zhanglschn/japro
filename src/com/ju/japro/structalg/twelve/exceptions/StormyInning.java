package com.ju.japro.structalg.twelve.exceptions;

import com.ju.japro.common.util.Print;

@SuppressWarnings("all")
class BaseballException extends Exception {}
@SuppressWarnings("all")
class Foul extends BaseballException {}
@SuppressWarnings("all")
class Strike extends BaseballException {}
@SuppressWarnings("all")
abstract class Inning {
	public Inning() throws BaseballException {}
	public void event() throws BaseballException {}
	public abstract void atBat() throws Strike,Foul;
	public void walk() {}
}

@SuppressWarnings("all")
class StormException extends Exception {}
@SuppressWarnings("all")
class RainedOut extends StormException{}
@SuppressWarnings("all")
class PopFoul extends Foul {}

interface Storm {
	public void event() throws RainedOut;
	public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {
	
	public StormyInning() throws RainedOut,BaseballException {}
	public StormyInning(String s) throws Foul,BaseballException {}
	public void rainHard() throws RainedOut {}
	public void event() {}
	public void atBat() throws PopFoul{}
	public static void main(String[] args) {
		try {
			StormyInning si = new StormyInning();
			si.atBat();
		} catch(PopFoul e) {
			Print.print("Pop foul");
		} catch (RainedOut e) {
			Print.print("Rained out");
		} catch (BaseballException e) {
			Print.print("Generic baseball exception");
		}
		
		try {
			Inning i = new StormyInning();
			i.atBat();
		} catch (Strike e) {
			Print.print("Strike");
		} catch(Foul e) {
			Print.print("Foul");
		} catch (RainedOut e) {
			Print.print("Rained out");
		} catch (BaseballException e) {
			Print.print("Generic baseball exception");
		}
	}
}