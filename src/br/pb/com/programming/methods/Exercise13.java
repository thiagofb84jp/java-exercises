package br.pb.com.programming.methods;

public class Exercise13 {

	/*
	 * 13. Write a Java method to find all twin prime numbers less than 100.
	 */
	public static void main(String[] args) {
		for (int i = 2; i < 100; i++) {
			if (isPrime(i) && isPrime(i + 2)) {
				System.out.printf("(%d, %d)\n", i, i + 2);
			}
		}

	}

	private static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
}