package br.pb.com.programming.basic;

import java.util.Scanner;

public class Exercise20 {

	/*
	 * 20. Write a Java program to convert a decimal number to binary number.
	 */
	public static void main(String[] args) {
		int decNumber, quot, i = 1, j;
		int binNumber[] = new int[100];
		
		Scanner in = new Scanner(System.in);

		System.out.println("Input a decimal number: ");
		decNumber = in.nextInt();

		quot = decNumber;

		while (quot != 0) {
			binNumber[i++] = quot % 2;
			quot = quot / 2;
		}

		System.out.println("Binary number is: ");

		for (j = i; j > 0; j--) {
			System.out.print(binNumber[j]);
		}

		System.out.print("\n");

		in.close();
	}
}