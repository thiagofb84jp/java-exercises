package br.pb.com.programming.conditionalStatement;

import java.util.Scanner;

public class Exercise06 {

	/*
	 * 6. Write a Java program that reads in two floating-point numbers and tests
	 * whether they are the same up to three decimal places.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input floating-point number.");
		double x = in.nextDouble();
		
		System.out.println("Input floating-point another number.");
		double y = in.nextDouble();

		x = Math.round(x * 1000);
		x = x / 1000;

		y = Math.round(y * 1000);
		y = y / 1000;

		if (x == y) {
			System.out.println("They are the same up to three decimal places.");
		} else {
			System.out.println("The are different.");
		}

		in.close();
	}
}