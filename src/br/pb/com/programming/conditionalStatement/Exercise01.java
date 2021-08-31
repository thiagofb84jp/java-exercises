package br.pb.com.programming.conditionalStatement;

import java.util.Scanner;

public class Exercise01 {

	/*
	 * 1. Write a Java program to get a number from the user and print whether it is
	 * positive or negative.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input a number: ");
		int number = in.nextInt();

		if (number > 0) {
			System.out.println("Number " + number + " is positive.");
		} else if (number < 0) {
			System.out.println("Number " + number + " is negative.");
		} else {
			System.out.println("Number is zero.");
		}
		
		in.close();
	}
}