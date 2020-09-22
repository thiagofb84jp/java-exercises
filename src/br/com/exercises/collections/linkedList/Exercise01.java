package br.com.exercises.collections.linkedList;

import java.util.LinkedList;

public class Exercise01 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to append the specified element to the end of a linked list.
		 */
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Red");
		linkedList.add("Green");
		linkedList.add("Black");
		linkedList.add("White");
		linkedList.add("Pink");
		linkedList.add("Yellow");

		System.out.println("The linked list: " + linkedList);
	}
}