package br.pb.com.programming.methods;

import java.util.Scanner;

public class Exercise11 {

	/*
	 * 11. Write a Java method (takes a number n as input) to displays an n-by-n
	 * matrix.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input a number: ");
		int number = in.nextInt();

		printMatrix(number);

		in.close();
	}

	private static void printMatrix(int number) {
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				System.out.print((int)(Math.random() * 2) + " ");
			}
			System.out.println();
		}
	}
}