package br.com.exercises.collections.arrayList;

import java.util.ArrayList;

public class Exercise21 {
	/*
	 * Write a Java program to print all the elements of a ArrayList using the position of the elements
	 */
	public static void main(String[] args) {
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		c1.add("Blue");
		
		System.out.println("\nOriginal array list: " + c1);
		System.out.println("\nPrint using index of an element: ");
		
		int noOfElements = c1.size();
		
		for(int index = 0; index < noOfElements; index++) {
			System.out.println("["+ index + "] "+ c1.get(index));
		}
	}
}