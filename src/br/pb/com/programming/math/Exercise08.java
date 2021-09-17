package br.pb.com.programming.math;

import java.util.Scanner;

public class Exercise08 {

	/*
	 * 8. Write a Java program to convert a float value to absolute value.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input an float number: ");
		float number = in.nextFloat();

		System.out.printf("The absolute value of %.2f is: %.2f", number, convert(number));

		in.close();
	}

	private static float convert(float number) {
		float absValue = (number >= 0) ? number : -number;

		return absValue;
	}
}