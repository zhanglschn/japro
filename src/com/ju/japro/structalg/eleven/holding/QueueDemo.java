package com.ju.japro.structalg.eleven.holding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import com.ju.japro.common.util.Print;
@SuppressWarnings("all")
public class QueueDemo {
	public static void printQ(Queue queue) {
		while(queue.peek() != null) {
			Print.printnb(queue.poll() + "  ");
		}
		Print.print();
	}
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Random rand = new Random(47);
		for (int i = 0; i < 10; i++) {
			queue.offer(rand.nextInt(i + 10));
		}
		printQ(queue);
		Queue<Character> qc = new LinkedList<Character>();
		for (char c : "Brontosaurus".toCharArray()) {
			qc.offer(c);
		}
		printQ(qc);
	}
}