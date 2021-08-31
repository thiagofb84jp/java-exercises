package br.pb.com.programming.basic;

public class Exercise11 {

	/*
	 * 11. Write a Java program to print the area and perimeter of a circle.
	 */
	private static final double RADIUS = 7.5;

	public static void main(String[] args) {
		double perimeter = 2 * Math.PI * RADIUS;
		double area = Math.PI * RADIUS * RADIUS;

		System.out.println("Perimeter is = " + perimeter);
		System.out.println("Area is = " + area);
	}
}