package br.com.exercises.collections.priorityQueue;

import java.util.PriorityQueue;

public class Exercise08 {
	/*
	 * Write a Java program to convert a Priority Queue elements to a string representation.
	 */
	public static void main(String[] args) {
		PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
		priorityQueue.add("Red");
		priorityQueue.add("Green");
		priorityQueue.add("Black");
		priorityQueue.add("White");
		
		System.out.println("Priority Queue: " + priorityQueue);
		
		String str1 = priorityQueue.toString();
		System.out.println("String representation of the Priority Queue: " + str1);

	}
}