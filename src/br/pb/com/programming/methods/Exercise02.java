package br.pb.com.programming.methods;

import java.util.Scanner;

public class Exercise02 {

	/*
	 * 2. Write a Java method to compute the average of three numbers.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input the first number: ");
		double x = in.nextDouble();

		System.out.println("Input the second number: ");
		double y = in.nextDouble();

		System.out.println("Input the third number: ");
		double z = in.nextDouble();

		System.out.println("The average value is: " + average(x, y, z) + "\n");

		in.close();
	}

	private static double average(double x, double y, double z) {
		return (x + y + z) / 3;
	}
}