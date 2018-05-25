//: object/HelloDate.java
package com.ju.japro.main;
import java.util.Date;

/**
 * The first Thinking in Java example program.
 * Displays a String and today's date
 * @author easyj
 * @author www.juzix.com
 * @version 4.0
 */
public class HelloDate {
	/**
	 * Entrv point to class & application
	 * @param arguments array of String arguments
	 * @throws exceptions No exceptions thrown
	 */
	public static void main(String[] arguments) {
		System.out.println("Hello,it 's :");
		System.out.println(new Date());
	}
} /* Output:(%%% match)
hello,it's:
Wed Oct 05 14:39:36 MDT 2017
*///:~