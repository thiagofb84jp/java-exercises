package br.pb.com.programming.math;

import java.util.Scanner;

public class Exercise03 {

	/*
	 * 3. Write a Java program to test if a double number is an integer.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input a number: ");
		double number = in.nextDouble();

		if ((number % 1) == 0)
			System.out.println("It's not a double number.");
		else
			System.out.println("It's a double number.");

		in.close();
	}
}