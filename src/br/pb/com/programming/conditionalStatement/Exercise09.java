package br.pb.com.programming.conditionalStatement;

import java.util.Scanner;

public class Exercise09 {

	/*
	 * 9. Write a Java program that takes the user to provide a single character
	 * from the alphabet.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input an alphabet: ");
		String input = in.next().toLowerCase();

		boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
		boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
		boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o")
				|| input.equals("u");

		if (input.length() > 1) {
			System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
		} else if (!(uppercase || lowercase)) {
			System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
		} else if (vowels) {
			System.out.println("Input letter is Vowel.");
		} else {
			System.out.println("Input letter is Consoant.");
		}

		in.close();
	}
}