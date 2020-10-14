package br.com.exercises.collections.linkedList;

import java.util.LinkedList;

public class Exercise20 {
	/*
	 * Write a Java program to join two linked lists.
	 */
	public static void main(String[] args) {
		LinkedList<String> linkedListOne = new LinkedList<String>();
		linkedListOne.add("Red");
		linkedListOne.add("Green");
		linkedListOne.add("Black");
		linkedListOne.add("Pink");
		linkedListOne.add("White");
		
		System.out.println("List of first Linked List: " + linkedListOne);
		
		LinkedList<String> linkedListTwo  = new LinkedList<String>();
		linkedListTwo.add("Blue");
		linkedListTwo.add("Purple");
		linkedListTwo.add("Yellow");
		linkedListTwo.add("Grey");
		
		System.out.println("List of second Linked List: " + linkedListTwo);
		
		LinkedList<String> linkedListThree  = new LinkedList<String>();
		linkedListThree.addAll(linkedListOne);
		linkedListThree.addAll(linkedListTwo);
		
		System.out.println("The new Linked List: " + linkedListThree);	
	}
}