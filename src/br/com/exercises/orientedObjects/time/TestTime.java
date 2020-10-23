package br.com.exercises.orientedObjects.time;

public class TestTime {

	public static void main(String[] args) {
		Time timeOne = new Time(10, 40, 36);

		System.out.println("Get hours: " + timeOne.getHour());
		System.out.println("Get minutes: " + timeOne.getMinute());
		System.out.println("Get seconds: " + timeOne.getSecond());
		System.out.println("Get Time: " + timeOne);

		System.out.println("Get Next Second: " + timeOne.nextSecond());
		System.out.println("Get Previous Second: " + timeOne.previousSecond());
		System.out.println("Get Previous Second Again: " + timeOne.previousSecond());

		Time timeTwo = new Time();
		timeTwo.setHour(05);
		timeTwo.setMinute(20);
		timeTwo.setSecond(02);

		System.out.println("\nGet hours: " + timeTwo.getHour());
		System.out.println("Get minutes: " + timeTwo.getMinute());
		System.out.println("Get seconds: " + timeTwo.getSecond());
		System.out.println("Get Time: " + timeTwo);

		System.out.println("Get Next Second: " + timeTwo.nextSecond());
		System.out.println("Get Previous Second: " + timeTwo.previousSecond());
		System.out.println("Get Previous Second Again: " + timeTwo.previousSecond());

	}
}