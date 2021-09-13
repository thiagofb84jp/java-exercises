package br.pb.com.programming.methods;

import java.util.Scanner;

public class Exercise06 {

	/*
	 * 6. Write a Java method to count all vowels in a string.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input the string: ");
		String str = in.nextLine();

		System.out.println("Number of Vowels in the string: " + countVowels(str) + "\n");

		in.close();
	}

	private static int countVowels(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}
}