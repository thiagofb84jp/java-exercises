package br.pb.com.programming.conditionalStatement;

import java.util.Scanner;

public class Exercise13 {

	/*
	 * 13. Write a program in Java to display the cube of the number upto given an
	 * integer.
	 */
	public static void main(String[] args) {
		System.out.println("Input numbers of terms: ");

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int i = 0; i <= n; i++) {
			System.out.println("Number is: " + i + " and cube of " + i + " is :" + (i * i * i));
		}

		in.close();
	}
}