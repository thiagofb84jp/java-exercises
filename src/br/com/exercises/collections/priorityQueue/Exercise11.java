package br.com.exercises.collections.priorityQueue;

import java.util.PriorityQueue;

public class Exercise11 {
	/*
	 * Write a Java program to change priorityQueue to maximum priorityqueue.
	 */
	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<Integer>();

		priorityQueue1.add(10);
		priorityQueue1.add(22);
		priorityQueue1.add(36);
		priorityQueue1.add(25);
		priorityQueue1.add(16);
		priorityQueue1.add(70);
		priorityQueue1.add(82);
		priorityQueue1.add(89);
		priorityQueue1.add(14);

		System.out.println("Original Priority Queue: " + priorityQueue1);
		
		System.out.println("\nMaximum Priority Queue: ");
		
		Integer value = null;
		
		while((value = priorityQueue1.poll()) != null) {
			System.out.println(value + " ");
		}

		System.out.println("\n");
	}

}
