package br.pb.com.programming.methods;

import java.util.Scanner;

public class Exercise12 {

	/*
	 * 12. Write a Java method to create the area of a pentagon.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input the number of sides: ");
		int number = in.nextInt();

		System.out.println("Input the side: ");
		double side = in.nextDouble();

		System.out.printf("The area of the pentagon is %.2f", pentagonArea(number, side));
		
		in.close();
	}

	private static double pentagonArea(int number, double side) {
		return (number * side * side) / (4 * Math.tan(Math.PI / number));
	}
}