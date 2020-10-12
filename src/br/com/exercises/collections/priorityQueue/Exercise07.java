package br.com.exercises.collections.priorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Exercise07 {
	/*
	 * Write a Java program to convert a priority queue to an array containing all of the elements of the queue
	 */
	public static void main(String[] args) {
		PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
		priorityQueue.add("Red");
		priorityQueue.add("Green");
		priorityQueue.add("Black");
		priorityQueue.add("White");
		
		System.out.println("Priority Queue: " + priorityQueue);
		
		List<String> arrayList = new ArrayList<String>(priorityQueue);
		System.out.println("Array containing all of elements in the Queue: " + arrayList);
	}
}