package br.com.exercises.collections.linkedList;

import java.util.LinkedList;

public class Exercise09 {
	/*
	 * Write a Java program to insert some elements at the specified position into a linked list.
	 */
	public static void main(String[] args) {
		LinkedList<String> linkedListOne = new LinkedList<String>();
		linkedListOne.add("Red");
		linkedListOne.add("Green");
		linkedListOne.add("Black");
		
		System.out.println("Original Linked List: " + linkedListOne);
		
		LinkedList<String> linkedListTwo = new LinkedList<String>();
		linkedListTwo.add("White");
		linkedListTwo.add("Pink");
		
		linkedListOne.addAll(1, linkedListTwo);
		
		System.out.println("LinkedList: " + linkedListOne);
		
		

	}
}