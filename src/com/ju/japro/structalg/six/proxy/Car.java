package com.ju.japro.structalg.six.proxy;

import java.util.Random;
import static com.ju.japro.common.util.Print.print;

public class Car implements Moveable {
	public void move() throws Exception {
		Thread.sleep(new Random().nextInt(1000));
		print("汽车行驶中...");
	}
}