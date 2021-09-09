package br.pb.com.programming.basic;

import java.util.Scanner;

public class Exercise24 {

	/*
	 * 24. Write a Java program to reverse a string.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input an string: ");
		char[] letters = in.nextLine().toCharArray();

		System.out.println("Reverse string: ");

		for (int i = letters.length - 1; i >= 0; i--) {
			System.out.print(letters[i]);
		}

		in.close();
	}
}