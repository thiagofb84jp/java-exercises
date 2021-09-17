package br.pb.com.programming.math;

public class Exercise06 {

	/*
	 * 6. Write a Java program to reverse an integer number.
	 */
	public static void main(String[] args) {
		int number = 1287;
		int isPositive = 1;

		if (number < 0) {
			isPositive = -1;
			number *= -1;
		}

		int sum = 0;
		while (number > 0) {
			int r = number % 10;

			int maxDiff = Integer.MAX_VALUE - sum * 10;

			if (sum > Integer.MAX_VALUE / 10 || r > maxDiff)
				System.out.println("Wrong number!");

			sum = sum * 10 + r;
			number /= 10;
		}
		System.out.println(isPositive * sum);
	}
}