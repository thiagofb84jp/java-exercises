package br.pb.com.programming.basic;

import java.util.Scanner;

public class Exercise40 {

	/*
	 * 40. Write a Java program that accepts two integer values between 25 to 75 and
	 * return true if there is a common digit in both numbers.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input the first number: ");
		int x = in.nextInt();

		System.out.println("Input the second number: ");
		int y = in.nextInt();

		System.out.println("Result: " + commonDigit(x, y));

		in.close();
	}

	private static boolean commonDigit(int p, int q) {
		if (p < 25 || q > 75)
			return false;

		int x = p % 10;
		int y = q % 10;

		p /= 10;
		q /= 10;

		return (p == q || p == y || x == q || x == y);
	}
}