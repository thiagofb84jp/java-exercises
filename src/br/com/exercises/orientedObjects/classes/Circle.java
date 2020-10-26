package br.com.exercises.orientedObjects.classes;

public class Circle {

	private double radius;

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

	public double getCircumference() {
		return 2 * Math.PI * this.radius;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circle [radius=");
		builder.append(radius);
		builder.append(", getRadius()=");
		builder.append(getRadius());
		builder.append(", getArea()=");
		builder.append(getArea());
		builder.append(", getCircumference()=");
		builder.append(getCircumference());
		builder.append("]");
		return builder.toString();
	}
}