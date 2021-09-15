package br.pb.com.programming.methods;

import java.util.Scanner;

public class Exercise14 {

	/*
	 * 14. Write a Java method to check whether a string is a valid password.
	 */

	public static final int PASSWORD_LENGTH = 8;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("1. A password must have at least eight characters.\n"
				+ "2. A password consists of only letters and digits.\n"
				+ "3. A password must contain at least two digits \n"
				+ "Input a password (You are agreeing to the above Terms and Conditions.): ");

		String str = in.nextLine();

		if (isValidPassword(str)) {
			System.out.println("Password is valid: " + str);
		} else {
			System.out.println("Not a valid password: " + str);
		}

		in.close();
	}

	private static boolean isValidPassword(String password) {
		if (password.length() < PASSWORD_LENGTH) {
			return false;
		}

		int charCount = 0;
		int numCount = 0;

		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);

			if (isNumeric(ch)) {
				numCount++;
			} else if (isLetter(ch)) {
				charCount++;
			} else {
				return false;
			}
		}
		return (charCount >= 2 && numCount >= 2);
	}

	private static boolean isLetter(char ch) {
		ch = Character.toUpperCase(ch);

		return (ch >= 'A' && ch <= 'Z');
	}

	private static boolean isNumeric(char ch) {
		return (ch >= '0' && ch <= '9');
	}
}