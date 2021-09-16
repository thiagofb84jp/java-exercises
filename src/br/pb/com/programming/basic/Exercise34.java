package br.pb.com.programming.basic;

import java.util.Scanner;

public class Exercise34 {

	/*
	 * 34. Write a Java program to convert a string to an integer in Java.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input a number (String): ");
		String str = in.nextLine();
		
		int result = Integer.parseInt(str);
		
		System.out.printf("The integer value is: %d", result);
		
		in.close();
	}
}