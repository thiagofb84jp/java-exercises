package br.pb.com.programming.basic;

import java.util.Scanner;

public class Exercise25 {

	/*
	 * 25. Write a Java program to print the ASCII value of a given character.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input a character: ");
		char character = in.next().charAt(0);

		int chr = character;

		System.out.println("The ASCII value of " + character + " is: " + chr);

		in.close();
	}
}