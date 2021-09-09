package br.pb.com.programming.basic;

import java.util.Scanner;

public class Exercise23 {

	/*
	 * 23. Write a Java program and compute the sum of the digits of an integer.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input an integer: ");
		int n = in.nextInt();

		System.out.println("The sum of the digits is: " + sumDigits(n));

		in.close();
	}

	private static int sumDigits(int n) {
		int sum = 0;

		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;
	}
}