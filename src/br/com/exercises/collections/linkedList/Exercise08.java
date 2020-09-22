package br.com.exercises.collections.linkedList;

import java.util.LinkedList;

public class Exercise08 {
	/*
	 * Write a Java program to insert elements into the linked list at the first and last position.
	 */
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Red");
		linkedList.add("Green");
		linkedList.add("Black");
		
		System.out.println("Original Linked List: " + linkedList);
		
		linkedList.addFirst("White");
		
		linkedList.addLast("Pink");
		
		System.out.println("Final Linked List: " + linkedList);
	}
}