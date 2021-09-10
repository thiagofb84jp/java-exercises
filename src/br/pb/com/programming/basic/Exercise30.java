package br.pb.com.programming.basic;

public class Exercise30 {

	/*
	 * 30. Write a Java program to count the letters, spaces, numbers and other
	 * characters of an input string.
	 */
	public static void main(String[] args) {
		String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		count(test);
	}

	private static void count(String word) {
		char[] ch = word.toCharArray();
		int letter = 0;
		int space = 0;
		int number = 0;
		int other = 0;

		for (int i = 0; i < word.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			} else if (Character.isDigit(ch[i])) {
				number++;
			} else if (Character.isSpaceChar(ch[i])) {
				space++;
			} else {
				other++;
			}
		}
		
		System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
		System.out.println("Letter : " + letter);
		System.out.println("Spaces : " + space);
		System.out.println("Numbers : " + number);
		System.out.println("Other : " + other);
	}
}