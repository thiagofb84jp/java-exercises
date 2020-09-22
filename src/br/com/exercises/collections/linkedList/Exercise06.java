package br.com.exercises.collections.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Exercise06 {
	/*
	 * Write a Java program to iterate a linked list in reverse order.
	 */
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Red");
		linkedList.add("Green");
		linkedList.add("Black");
		linkedList.add("Pink");
		linkedList.add("Orange");
		
		System.out.println("Original Linked List: " + linkedList);
		
		Iterator<String> iterator = linkedList.descendingIterator();
		
		System.out.println("Elements in Reverse Order");
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}