package br.pb.com.programming.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise04 {

	/*
	 * 4. Write a Java program to round a float number to specified decimals.
	 */
	public static void main(String[] args) {
		float number = 451.32564122F;
		int decimalPlace = 4;

		BigDecimal bigDecimal = new BigDecimal(Float.toString(number));
		bigDecimal = bigDecimal.setScale(decimalPlace, RoundingMode.HALF_UP);

		System.out.printf("Original number: %.7f\n", number);
		System.out.printf("Rounded upto 4 decimal: %s", bigDecimal);
	}
}