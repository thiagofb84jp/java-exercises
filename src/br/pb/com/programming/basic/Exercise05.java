package br.pb.com.programming.basic;

import java.util.Scanner;

public class Exercise05 {

	/*
	 * 5. Write a Java program that takes two numbers as input and display the
	 * product of two numbers.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input the first number: ");
		int num1 = in.nextInt();

		System.out.println("Input the second number: ");
		int num2 = in.nextInt();

		int product = num1 * num2;

		System.out.println(num1 + " x " + num2 + " = " + product);

		in.close();
	}
}