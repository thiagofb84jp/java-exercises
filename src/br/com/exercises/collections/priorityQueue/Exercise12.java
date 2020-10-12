package br.com.exercises.collections.priorityQueue;

import java.util.PriorityQueue;

public class Exercise12 {
	/*
	 * Write a Java program to compare two priority queues. 
	 */
	public static void main(String[] args) {
		PriorityQueue<String> priorityQueue1 = new PriorityQueue<String>();
		priorityQueue1.add("Red");
		priorityQueue1.add("Green");
		priorityQueue1.add("Black");
		priorityQueue1.add("White");
		
		System.out.println("First Priority Queue: " + priorityQueue1);
		
		PriorityQueue<String> priorityQueue2 = new PriorityQueue<String>();
		priorityQueue2.add("Red");
		priorityQueue2.add("Pink");
		priorityQueue2.add("Black");
		priorityQueue2.add("Orange");
		
		System.out.println("Second Priority Queue: " + priorityQueue2);
		
		for(String element: priorityQueue1) {
			System.out.println(priorityQueue2.contains(element) ? "Yes" : "No");
		}		
	}
}