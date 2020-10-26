package br.com.exercises.orientedObjects.classes;

public class TestDate {
	
	public static void main(String[] args) {
		Date dateOne = new Date(10, 5, 2020);
		System.out.println(dateOne.toString());
		
		Date dateTwo = new Date();
		dateTwo.setDate(28, 9, 2010);
		System.out.println(dateTwo.toString());		
	}
}