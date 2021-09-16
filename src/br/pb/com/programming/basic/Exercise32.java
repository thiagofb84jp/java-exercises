package br.pb.com.programming.basic;

import java.util.Scanner;

public class Exercise32 {

	/*
	 * 32. Write a Java program to accept a number and check the number is even or
	 * not. Prints 1 if the number is even or 0 if the number is odd.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input a number: ");

		int number = in.nextInt();

		if (number % 2 == 0)
			System.out.println(1);
		else
			System.out.println(0);

		in.close();
	}
}