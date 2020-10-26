package br.com.exercises.string;

public class Exercise07 {
	/*
	 * Write a Java program to compare a given string to the specified character sequence. 
	 */
	public static void main(String[] args) {
		String str1 = "example.com", str2 = "Example.com", str3 = "eXample.com";
		CharSequence charSequence = "example.com";
		
		System.out.println("Comparing " + str1 + " and " + charSequence + ": " + str1.contentEquals(charSequence));
		System.out.println("Comparing " + str2 + " and " + charSequence + ": " + str2.contentEquals(charSequence));
		System.out.println("Comparing " + str3 + " and " + charSequence + ": " + str3.contentEquals(charSequence));
	}
}