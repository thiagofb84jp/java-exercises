package br.pb.com.programming.basic;

import java.io.Console;
import java.util.Arrays;

public class Exercise29 {

	/*
	 * 29. Write a Java program to input and display your password.
	 */
	public static void main(String[] args) {
		Console cons = System.console();

		if (cons!= null) {
			char[] password = null;
			try {
				password = cons.readPassword("Input your password: ");
				System.out.println("Your password was: " + new String(password));
			} finally {
				if (password != null) {
					Arrays.fill(password, ' ');
				}
			}
		} else {
			throw new RuntimeException();
		}
	}
}