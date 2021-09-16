package br.pb.com.programming.basic;

import java.util.Scanner;

public class Exercise37 {

	/*
	 * 37. Write a Java program to accepts an integer and count the factors of the
	 * number.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input an integer: ");
		int x = in.nextInt();

		System.out.println(result(x));

		in.close();
	}

	private static int result(int number) {
		int ctr = 0;

		for (int i = 1; i <= (int) Math.sqrt(number); i++) {
			if ((number % i == 0) && (i * i != number))
				ctr += 2;
			else if (i * i == number)
				ctr++;
		}

		return ctr;
	}
}