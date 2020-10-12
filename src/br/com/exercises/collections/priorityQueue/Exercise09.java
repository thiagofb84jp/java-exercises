package br.com.exercises.collections.priorityQueue;

import java.util.PriorityQueue;

public class Exercise09 {
	/*
	 * Write a Java program to retrieve the first element of the priority queue.
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
		System.out.println("The first element of the Queue: " + priorityQueue1.peek());
	}
}