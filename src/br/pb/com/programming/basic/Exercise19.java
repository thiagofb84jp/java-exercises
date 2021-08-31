package br.pb.com.programming.basic;

import java.util.Scanner;

public class Exercise19 {

	/*
	 * 19. Write a Java program to convert a decimal number to hexadecimal number.
	 */
	public static void main(String[] args) {
		int decNumber, rem;
		String hexDecNumber = "";
		char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		Scanner in = new Scanner(System.in);

		System.out.println("Input a decimal number: ");
		decNumber = in.nextInt();


		while (decNumber > 0) {
			rem = decNumber % 16;
			hexDecNumber = hex[rem] + hexDecNumber;
			decNumber = decNumber / 16;
		}

		System.out.println("Hexadecimal number is: " + hexDecNumber + "\n");

		in.close();
	}
}