package br.com.exercises.collections.priorityQueue;

import java.util.PriorityQueue;

public class Exercise02 {
	/*
	 * Write a Java program to iterate through all elements in priority queue.
	 */
	public static void main(String[] args) {
		PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
		priorityQueue.add("Red");
		priorityQueue.add("Green");
		priorityQueue.add("Orange");
		priorityQueue.add("White");
		priorityQueue.add("Black");
		System.out.println("Elements of the Priority Queue");

		for (String element : priorityQueue) {
			System.out.println(element);
		}
	}
}