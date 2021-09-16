package br.pb.com.programming.basic;

import java.util.Scanner;

public class Exercise38 {

	/*
	 * 38. Write a Java program to convert a given string into lowercase.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input an String (in UPPER case): ");
		String line = in.nextLine();

		line = line.toLowerCase();
		System.out.println(line);

		in.close();
	}
}