package br.com.exercises.collections.priorityQueue;

import java.util.PriorityQueue;

public class Exercise06 {
	/*
	 * Write a Java program to count the number of elements in a priority queue.
	 */
	public static void main(String[] args) {
		PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
		priorityQueue.add("Red");
		priorityQueue.add("Green");
		priorityQueue.add("Black");
		priorityQueue.add("Pink");
		priorityQueue.add("Orange");

		System.out.println("Priority Queue: " + priorityQueue);
		System.out.println("Size of the Priority Queue: " + priorityQueue.size());
	}
}