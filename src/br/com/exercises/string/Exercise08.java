package br.com.exercises.string;

public class Exercise08 {
	/*
	 * Write a Java program to compare a given string to the specified string buffer.
	 */
	public static void main(String[] args) {
		String str1 = "example.com", str2 = "Example.com";
		StringBuffer stringBuffer = new StringBuffer(str1);
		
		System.out.println("Comparing " + str1 + " and "+ stringBuffer + ": " + str1.contentEquals(stringBuffer));
		System.out.println("Comparing " + str2 + " and "+ stringBuffer + ": " + str2.contentEquals(stringBuffer));
	}
}