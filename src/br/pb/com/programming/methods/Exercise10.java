package br.pb.com.programming.methods;

import java.util.Scanner;

public class Exercise10 {

	/*
	 * 10. Write a Java method to check whether an year (integer) entered by the
	 * user is a leap year or not.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input a year: ");
		int year = in.nextInt();

		System.out.println(isLeapYear(year));
		
		in.close();
	}

	private static boolean isLeapYear(int year) {
		boolean a = (year % 4) == 0;
		boolean b = (year % 100) != 0;
		boolean c = ((year % 100 == 0) && (year % 400 == 0));

		return a && (b || c);
	}
}