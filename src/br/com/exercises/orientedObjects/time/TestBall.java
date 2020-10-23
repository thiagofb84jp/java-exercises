package br.com.exercises.orientedObjects.time;

public class TestBall {

	public static void main(String[] args) {
		Ball b1 = new Ball(1, 2, 11, 22, 5);
		b1.move();
		b1.reflectHorizontal();
		b1.reflectVertical();
		System.out.println(b1);

		Ball b2 = new Ball();
		b2.setX(2);
		b2.setY(4);
		b2.setRadius(8);
		b2.setxDelta(7);
		b2.setyDelta(9);

		b2.move();
		b2.reflectHorizontal();
		b2.reflectVertical();

		System.out.println(b2);
	}
}