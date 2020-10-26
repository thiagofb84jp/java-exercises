package br.com.exercises.orientedObjects.classes;

public class TestAccount {

	public static void main(String[] args) {
		Account accountOne = new Account("1", "Jonathan Lima Macedo", 100);

		System.out.println("*************** Account Data [1] ***************");
		System.out.println(accountOne.toString());
		
		System.out.println("Put on money: " + accountOne.credit(100));
		System.out.println("Get out money: " + accountOne.debit(50));
		
		Account accountTwo = new Account("2", "Karla Vieira Lima Andrade", 50);

		System.out.println("*************** Account Data [2] ***************");
		System.out.println(accountTwo.toString());
		
		System.out.println("Put on money: " + accountTwo.credit(10));
		System.out.println("Get out money: " + accountTwo.debit(5));
		
		System.out.println("Transfer money to: " + accountTwo.transferTo(accountOne, 10));
		
		Account accountThree = new Account("3", "Joanna Vieira Souza dos Santos", 200);

		System.out.println("*************** Account Data [3] ***************");
		System.out.println(accountThree.toString());
		
		System.out.println("Put on money: " + accountThree.credit(50));
		System.out.println("Get out money: " + accountThree.debit(251));
		
		System.out.println("Transfer money to: " + accountThree.transferTo(accountTwo, 300));

	}
}