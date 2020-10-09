package br.com.exercises.collections.priorityQueue;

import java.util.PriorityQueue;

public class Exercise03 {
	/*
	 * Write a Java program to remove all the elements from a priority queue.
	 */
	public static void main(String[] args) {
		PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
		priorityQueue.add("Red");
		priorityQueue.add("Green");
		priorityQueue.add("Orange");
		priorityQueue.add("White");
		
		System.out.println("Original Priority Queue: " + priorityQueue);
		
		priorityQueue.clear();
		
		System.out.println("The new Priority Queue: " + priorityQueue);
	}
}