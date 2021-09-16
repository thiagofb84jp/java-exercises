package br.pb.com.programming.basic;

import java.util.Scanner;

public class Exercise36 {

	/*
	 * 36. Write a Java program that accepts three integers from the user.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input the first number: ");
		int x = in.nextInt();

		System.out.println("Input the second number: ");
		int y = in.nextInt();

		System.out.println("Input the third number: ");
		int z = in.nextInt();

		System.out.println("The result is: " + comparison(x, y, z, true));

		in.close();
	}

	private static boolean comparison(int p, int q, int r, boolean compare) {
		if (compare)
			return (r > q);

		return ((p > q) && (r > q));
	}
}