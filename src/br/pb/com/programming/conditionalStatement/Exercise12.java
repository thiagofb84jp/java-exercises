package br.pb.com.programming.conditionalStatement;

import java.util.Scanner;

public class Exercise12 {

	/*
	 * 12. Write a program in Java to input 5 numbers from keyboard and find their
	 * sum and average.
	 */
	public static void main(String[] args) {
		System.out.println("Input the 5 numbers");

		Scanner in = new Scanner(System.in);

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int n = in.nextInt();

			sum += n;
		}

		double avg;
		avg = sum / 5;

		System.out.println("The sum of 5 no is : " + sum + "\nThe average is: " + avg);

		in.close();
	}
}