package br.com.exercises.collections.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Exercise03 {
	/*
	 * Write a Java program to iterate through all elements in a linked list starting at the specified position.
	 */
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Red");
		linkedList.add("Green");
		linkedList.add("Black");
		linkedList.add("White");
		linkedList.add("Pink");
		linkedList.add("Yellow");

		Iterator<String> iterator = linkedList.listIterator(1);
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}	
	}
}