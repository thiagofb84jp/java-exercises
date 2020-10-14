package br.com.exercises.collections.linkedList;

import java.util.LinkedList;

public class Exercise11 {
	/*
	 * Write a Java program to display the elements and their positions in a linked list.
	 */
	public static void main(String[] args) {
		LinkedList<String> linkedList= new LinkedList<String>();
		linkedList.add("Red");
		linkedList.add("Green");
		linkedList.add("Black");
		linkedList.add("Pink");
		linkedList.add("Orange");
		
		System.out.println("Original Linked List: " + linkedList);
		
		for(int i = 0; i < linkedList.size(); i++) {
			System.out.println("Element at index: [" + i + "] " + linkedList.get(i));
		}
	}
}