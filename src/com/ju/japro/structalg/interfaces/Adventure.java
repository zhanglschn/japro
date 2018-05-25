package com.ju.japro.structalg.interfaces;

interface CanFight {
	void fight();
}
interface CanSwim {
	void swim();
}
interface CanFly {
	void fly();
}
interface CanClimb {
	void climb();
}

interface CAll extends CanFight,CanSwim,CanFly,CanClimb{
	void c();
}

class ActionCharacter {
	public void fight() {}
	public void climb() {}
}
class Hero extends ActionCharacter implements CAll {
	public void fly() {
	}
	public void swim() {
	}
	public void c() {
		
	}
}

public class Adventure {
	public static void t(CanFight x) {x.fight();}
	public static void u(CanSwim x){x.swim();}
	public static void v(CanFly x){x.fly();}
	public static void w(ActionCharacter x){x.fight();}
	public static void e(CAll c1) {c1.c();}
	
	public static void main(String[] args) {
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
		e(h);
	}
}