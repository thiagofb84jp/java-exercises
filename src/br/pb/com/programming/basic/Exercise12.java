package br.pb.com.programming.basic;

import java.util.Scanner;

public class Exercise12 {

	/*
	 * 12. Write a Java program that takes five numbers as input to calculate and
	 * print the average of the numbers.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input first number: ");
		int num1 = in.nextInt();
		
		System.out.println("Input second number: ");
		int num2 = in.nextInt();
		
		System.out.println("Input third number: ");
		int num3 = in.nextInt();

		System.out.println("Input fourth number: ");
		int num4 = in.nextInt();
		
		System.out.println("Input fourth number: ");
		int num5 = in.nextInt();
		
		double average = (num1 + num2 + num3 + num4 + num5) / 5;
		
		System.out.println("Average of five numbers is:" + average);
		
		in.close();
	}
}