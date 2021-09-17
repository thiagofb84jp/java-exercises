package br.pb.com.programming.math;

import java.util.Scanner;

public class Exercise07 {

	/*
	 * 7. Write a Java program to convert an integer value to absolute value.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input an integer number: ");
		int number = in.nextInt();

		System.out.printf("The absolute value of %d is: %d", number, convert(number));

		in.close();
	}

	private static int convert(int number) {
		int absValue = (number >= 0) ? number : -number;

		return absValue;
	}
}