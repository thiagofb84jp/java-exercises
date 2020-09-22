package br.com.exercises.collections.linkedList;

import java.util.LinkedList;

public class Exercise07 {
	/*
	 * Write a Java program to insert the specified element at the specified position in the linked list.
	 */
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Red");
		linkedList.add("Green");
		linkedList.add("Black");
		linkedList.add("White");
		linkedList.add("Pink");
		
		System.out.println("Original Linked List: " + linkedList);
		
		System.out.println("Let add Yellow color after the Red color: " + linkedList);
		linkedList.add(1, "Yellow");
		
		System.out.println("The Linked List: " + linkedList);
	}
}