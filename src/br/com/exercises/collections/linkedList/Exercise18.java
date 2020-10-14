package br.com.exercises.collections.linkedList;

import java.util.LinkedList;

public class Exercise18 {
	/*
	 * Write a Java program to clone an linked list to another linked list.
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Red");
		linkedList.add("Green");
		linkedList.add("Black");
		linkedList.add("Pink");
		linkedList.add("Orange");

		System.out.println("Original Linked List: " + linkedList);
		
		LinkedList<String> clonedLinkedList = new LinkedList<String>();
		clonedLinkedList.add("Blue");
		clonedLinkedList.add("White");
		
		clonedLinkedList = (LinkedList<String>) linkedList.clone();
		
		System.out.println("Cloned Linked List: " + clonedLinkedList);
	}
}