package br.com.exercises.orientedObjects.yetAnotherCircle;

public class TestCircle {
	
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.setRadius(2.4);
		
		System.out.printf("The circle has radius of " + c1.getRadius() + " and area of " 
					+ "%.2f", c1.getArea());
		
		System.out.printf("\nThe circle has radius of " + c1.getRadius() + " and circumferente of " 
					+ "%.2f", c1.getCircumference());
		
		System.out.println("\n"+ c1.toString());
		
		Circle c2 = new Circle(45.2);
		
		System.out.println("********************************************************");
		
		System.out.printf("The circle has radius of " + c2.getRadius() + " and area of " 
					+ "%.2f", c2.getArea());
		
		System.out.printf("\nThe circle has radius of " + c2.getRadius() + " and circumferente of " 
					+ "%.2f", c2.getCircumference());
		
		System.out.println("\n"+ c2.toString());
	}
}