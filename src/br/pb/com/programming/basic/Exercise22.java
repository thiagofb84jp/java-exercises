package br.pb.com.programming.basic;

import java.util.Scanner;

public class Exercise22 {

	/*
	 * 22. Write a Java program to compare two numbers.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input the first number: ");
		int number1 = in.nextInt();

		System.out.println("Input the second number: ");
		int number2 = in.nextInt();

		if (number1 == number2)
			System.out.printf("%d == %d\n", number1, number2);
		if (number1 != number2)
			System.out.printf("%d != %d\n", number1, number2);
		if (number1 < number2)
			System.out.printf("%d < %d\n", number1, number2);
		if (number1 > number2)
			System.out.printf("%d > %d\n", number1, number2);
		if (number1 <= number2)
			System.out.printf("%d <= %d\n", number1, number2);
		if (number1 >= number2)
			System.out.printf("%d <= %d\n", number1, number2);

		in.close();
	}
}