package br.pb.com.programming.basic;

import java.util.Scanner;

public class Exercise06 {

	/*
	 * 6. Write a Java program to print the sum (addition), multiply, subtract,
	 * divide and remainder of two numbers.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input the first number: ");
		int num1 = in.nextInt();

		System.out.println("Input the second number: ");
		int num2 = in.nextInt();

		calculator("+", num1, num2);
		calculator("-", num1, num2);
		calculator("*", num1, num2);
		calculator("/", num1, num2);

		in.close();
	}

	private static void calculator(String operation, int num1, int num2) {

		if (operation.equals("+")) {
			int sum = num1 + num2;
			System.out.println("Sum: " + num1 + operation + num2 + " = " + sum);
		} else if (operation.equals("-")) {
			int sub = num1 - num2;
			System.out.println("Subtract: " + num1 + operation + num2 + " = " + sub);
		} else if (operation.equals("*")) {
			int product = num1 * num2;
			System.out.println("Product: " + num1 + operation + num2 + " = " + product);
		} else if (operation.equals("/")) {
			int div = num1 / num2;
			System.out.println("Division: " + num1 + operation + num2 + " = " + div);
		}

	}
}