package br.pb.com.programming.basic;

public class Exercise13 {

	/*
	 * 13. Write a Java program to print the area and perimeter of a rectangle.
	 */
	public static void main(String[] args) {
		final double width = 5.6;
		final double height = 8.5;
		
		double perimeter = 2 * (height + width);
		
		double area = width * height;
		
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);
		System.out.printf("Area is %.1f * %.1f = %.2f \n", height, width, area);
	}
}