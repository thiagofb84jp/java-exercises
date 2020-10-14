package br.com.exercises.collections.linkedList;

import java.util.LinkedList;

public class Exercise19 {
	/*
	 * Write a Java program to remove first and last element from a linked list. 
	 */
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Red");
		linkedList.add("Green");
		linkedList.add("Black");
		linkedList.add("Pink");
		linkedList.add("Orange");
		
		System.out.println("Original Linked List: " + linkedList);
		
		Object firstElement = linkedList.removeFirst();
		System.out.println("Element removed: " + firstElement);
		
		Object lastElement = linkedList.removeLast();
		System.out.println("Element removed: " + lastElement);
		
		System.out.println("The new Linked List (after removing elements): " + linkedList);
	}
}