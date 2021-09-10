package br.pb.com.programming.methods;

import java.util.Scanner;

public class Exercise01 {

	/*
	 * 1. Write a Java method to find the smallest number among three numbers.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input the first number: ");
		double x = in.nextDouble();

		System.out.println("Input the second number: ");
		double y = in.nextDouble();

		System.out.println("Input the third number: ");
		double z = in.nextDouble();

		System.out.println("The smallest value is: " + smallest(x, y, z) + "\n");

		in.close();
	}

	private static double smallest(double x, double y, double z) {
		return Math.min(Math.min(x, z), z);
	}
}