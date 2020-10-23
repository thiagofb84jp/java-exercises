package br.com.exercises.orientedObjects.time;

public class Ball {

	private float x;

	private float y;

	private int radius;

	private float xDelta;

	private float yDelta;

	public Ball() {

	}

	public Ball(float x, float y, int radius, int speed, int direction) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.xDelta = speed;
		this.xDelta = direction;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public float getxDelta() {
		return xDelta;
	}

	public void setxDelta(float xDelta) {
		this.xDelta = xDelta;
	}

	public float getyDelta() {
		return yDelta;
	}

	public void setyDelta(float yDelta) {
		this.yDelta = yDelta;
	}

	public void move() {
		this.x += xDelta;
		this.y += yDelta;
	}

	public void reflectHorizontal() {
		xDelta -= xDelta;
	}

	public void reflectVertical() {
		yDelta -= yDelta;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ball [(x=");
		builder.append(x);
		builder.append(", y=");
		builder.append(y);
		builder.append("), speed=(");
		builder.append(xDelta);
		builder.append(", yDelta=");
		builder.append(yDelta);
		builder.append(")]");
		return builder.toString();
	}
}