package br.com.exercises.collections.linkedList;

import java.util.LinkedList;

public class Exercise10 {
	/*
	 * Write a Java program to get the first and last occurrence of the specified elements in a linked list.
	 */
	public static void main(String[] args) {
		LinkedList<String> linkedList= new LinkedList<String>();
		linkedList.add("Red");
		linkedList.add("Green");
		linkedList.add("Black");
		linkedList.add("Pink");
		linkedList.add("Orange");
		
		System.out.println("Original Linked List: " + linkedList);
		
		Object firstElement = linkedList.getFirst();
		System.out.println("First element is: " + firstElement);
		
		Object lastElement = linkedList.getLast();
		System.out.println("Last element is: " + lastElement);
		
		Object middleElement = linkedList.get(2);
		System.out.println("Middle element is: " + middleElement);
	}
}