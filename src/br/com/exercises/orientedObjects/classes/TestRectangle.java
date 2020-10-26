package br.com.exercises.orientedObjects.classes;

public class TestRectangle {
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setLength(2.5f);
		r1.setWidth(7.9f);
		
		System.out.printf("The area of rectangle is " + r1.getArea() + " and the perimeter is " +  
						"%.2f ", r1.getPerimeter());
		
		Rectangle r2 = new Rectangle(21.5f, 17.9f);
		
		System.out.printf("\nThe area of rectangle is " + r2.getArea() + " and the perimeter is " +  
						"%.2f ", r2.getPerimeter());
	}
}