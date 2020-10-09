package br.com.exercises.collections.priorityQueue;

import java.util.PriorityQueue;

public class Exercise05 {
	/*
	 * Write a Java program to add all the elements of a priority queue to another priority queue.
	 */
	public static void main(String[] args) {
		PriorityQueue<String> priorityQueue1 = new PriorityQueue<String>();
		priorityQueue1.add("Red");
		priorityQueue1.add("Green");
		priorityQueue1.add("Orange");
		System.out.println("Priority Queue 1" + priorityQueue1);

		PriorityQueue<String> priorityQueue2 = new PriorityQueue<String>();
		priorityQueue2.add("Pink");
		priorityQueue2.add("White");
		priorityQueue2.add("Black");
		System.out.println("Priority Queue 2" + priorityQueue2);

		priorityQueue1.addAll(priorityQueue2);

		System.out.println("New Priority Queue 1: " + priorityQueue1);
	}
}