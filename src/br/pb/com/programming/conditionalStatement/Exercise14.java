package br.pb.com.programming.conditionalStatement;

import java.util.Scanner;

public class Exercise14 {

	/*
	 * 14. Write a program in Java to display the multiplication table of a given
	 * integer.
	 */
	public static void main(String[] args) {
		System.out.println("Input numbers of terms: ");

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		System.out.println("\n");
		for (int i = 0; i <= 10; i++) {
			System.out.println(n + " X " + i + " = " + n * i);
		}

		in.close();
	}
}