package br.pb.com.programming.basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Exercise28 {

	/*
	 * 28. Write a Java program that accepts an integer (n) and computes the value
	 * of n+nn+nnn.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input number: ");
		int n = in.nextInt();

		System.out.printf("%d + %d%d + %d%d%d\n", n, n, n, n, n, n);

		in.close();
	}
}