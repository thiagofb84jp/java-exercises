package br.pb.com.programming.math;

public class Exercise01 {

	/*
	 * 1. Write a Java program to round up the result of integer division.
	 */
	public static void main(String[] args) {
		int totalTheoryMarks = 350, totalPractialMarks = 90, totalMarks = 500;

		int percentageOfMarks = ((totalTheoryMarks + totalPractialMarks) * 100) / totalMarks;

		System.out.printf("\nPercentage of Marks (in percent): %d", percentageOfMarks);
	}
}