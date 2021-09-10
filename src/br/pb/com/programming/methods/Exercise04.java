package br.pb.com.programming.methods;

import java.util.Scanner;

public class Exercise04 {

	/*
	 * 4. Write a Java method to compute the sum of the digits in an integer.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input an integer: ");
		int digits = in.nextInt();

		System.out.println("The sum is: " + sumDigits(digits));

		in.close();
	}

	private static int sumDigits(int number) {
		int result = 0;

		while (number > 0) {
			result += number % 10;
			number /= 10;
		}

		return result;
	}
}