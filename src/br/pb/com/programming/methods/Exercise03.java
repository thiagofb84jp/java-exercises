package br.pb.com.programming.methods;

import java.util.Scanner;

public class Exercise03 {

	/*
	 * 3. Write a Java method to display the middle character of a string.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input a string: ");
		String str = in.nextLine();

		System.out.println("The middle character in the string: " + middle(str) + "\n");

		in.close();
	}

	private static String middle(String str) {
		int position, length;

		if (str.length() % 2 == 0) {
			position = str.length() / 2 - 1;
			length = 2;
		} else {
			position = str.length() / 2;
			length = 1;
		}
		return str.substring(position, position + length);
	}
}