package br.pb.com.programming.basic;

public class Exercise33 {

	/*
	 * 33. Write a Java program to print numbers between 1 to 100 which are
	 * divisible by 3, 5 and by both.
	 */
	public static void main(String[] args) {
		System.out.println("\nDivided by 3: ");

		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0)
				System.out.print(i + ", ");
		}

		System.out.println("\nDivided by 5: ");

		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0)
				System.out.print(i + ", ");
		}

		System.out.println("\nDivided by 3 and 5: ");

		for (int i = 1; i < 100; i++) {
			if ((i % 3 == 0) && (i % 5 == 0))
				System.out.print(i + ", ");
		}

		System.out.println("\n");
	}
}