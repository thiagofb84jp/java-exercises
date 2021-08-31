package br.pb.com.programming.conditionalStatement;

import java.util.Scanner;

public class Exercise11 {

	/*
	 * 11. Write a program in Java to display n terms of natural numbers and their
	 * sum.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input a number: ");
		int n = in.nextInt();

		System.out.println("The first n natural numbers are: " + n);

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
			sum += i;
		}

		System.out.println("The sum of natural number upto " + n + " terms: " + sum);

		in.close();
	}
}