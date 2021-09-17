package br.pb.com.programming.math;

public class Exercise02 {

	/*
	 * 2. Write a Java program to get whole and fractional parts from a double
	 * value.
	 */
	public static void main(String[] args) {
		double value = 12.56;
		double fractionalPart = value % 1;
		double integralPart = value - fractionalPart;

		System.out.println("\nOriginal value: " + value);
		System.out.println("\nIntegral part: " + integralPart);
		System.out.println("\nFractional part: " + fractionalPart);
	}
}