package br.pb.com.programming.conditionalStatement;

import java.util.Scanner;

public class Exercise02 {

	/*
	 * 2. Write a Java program to solve quadratic equations (use if, else if and
	 * else).
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input 'a': ");
		double a = in.nextInt();

		System.out.println("Input 'b': ");
		double b = in.nextInt();

		System.out.println("Input 'c': ");
		double c = in.nextInt();

		double result = b * b - 4.0 * a * c;

		if (result > 0.0) {
			double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
			double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
			System.out.printf("The roots are %.2f and %.2f", r1, r2);
		} else if (result == 0.0) {
			double r1 = -b / (2.0 * a);
			System.out.printf("The roots are %.2f", r1);
		} else {
			System.out.println("The equation has no real roots.");
		}

		in.close();
	}
}