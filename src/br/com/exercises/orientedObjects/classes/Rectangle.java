package br.com.exercises.orientedObjects.classes;

public class Rectangle {

	private float length;

	private float width;

	public Rectangle() {

	}

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	public double getArea() {
		return this.length * this.width;
	}
	
	public double getPerimeter() {
		return 2 * (this.length + this.width);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rectangle [length=");
		builder.append(length);
		builder.append(", width=");
		builder.append(width);
		builder.append(", getLength()=");
		builder.append(getLength());
		builder.append(", getWidth()=");
		builder.append(getWidth());
		builder.append(", getArea()=");
		builder.append(getArea());
		builder.append(", getPerimeter()=");
		builder.append(getPerimeter());
		builder.append("]");
		return builder.toString();
	}
}