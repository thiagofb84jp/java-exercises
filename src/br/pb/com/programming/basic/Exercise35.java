package br.pb.com.programming.basic;

import java.util.Scanner;

public class Exercise35 {

	/*
	 * 35. Write a Java program to calculate the sum of two integers and return true
	 * if the sum is equal to a third integer.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input the first number: ");
		int x = in.nextInt();

		System.out.println("Input the second number: ");
		int y = in.nextInt();

		System.out.println("Input the third number: ");
		int z = in.nextInt();

		System.out.println("The result is: " + sumOfTwo(x, y, z));

		in.close();
	}

	private static boolean sumOfTwo(int p, int q, int r) {
		return ((p + q) == r || (q + r) == p || (r + p) == q);
	}
}