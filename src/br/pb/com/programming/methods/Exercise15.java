package br.pb.com.programming.methods;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exercise15 {

	/*
	 * 15. Write Java methods to calculate the area of a triangle.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input Side 1: ");
		double side1 = in.nextDouble();

		System.out.println("Input Side 2: ");
		double side2 = in.nextDouble();

		System.out.println("Input Side 3: ");
		double side3 = in.nextDouble();

		System.out.println(
				isValid(side1, side2, side3) ? "The area of the triangle is " + areaTriangle(side1, side2, side3)
						: "Invalid triangle");
		
		in.close();
	}

	private static boolean isValid(double side1, double side2, double side3) {
		if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)) {
			return true;
		} else {
			return false;
		}
	}

	private static String areaTriangle(double side1, double side2, double side3) {
		double area = 0;
		
		double s = (side1 + side2 + side3) / 2;

		area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		String.valueOf(area);
		
		NumberFormat numberFormat = NumberFormat.getNumberInstance();
		numberFormat.setMaximumFractionDigits(2);
		
		return numberFormat.format(area);
	}
}