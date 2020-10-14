package br.com.exercises.collections.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Exercise15 {
	/*
	 * Write a Java program to shuffle the elements in a linked list.
	 */
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Red");
		linkedList.add("Green");
		linkedList.add("Black");
		linkedList.add("Pink");
		linkedList.add("Orange");

		System.out.println("Original Linked List: " + linkedList);

		Collections.shuffle(linkedList);

		System.out.println("Linked List after shuffling: " + linkedList);
	}
}