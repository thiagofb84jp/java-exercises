package br.com.exercises.orientedObjects.account;

public class Account {

	private String id;

	private String name;

	private int balance;

	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public int credit(int amount) {
		return this.balance += amount;
	}

	public int debit(int amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
		} else {
			System.out.println("Amount excedeed");
		}

		return this.balance;
	}

	public int transferTo(Account account, int amount) {
		if (amount <= this.balance) {
			System.out.println("Old balance -> R$ " + this.balance);

			this.balance -= amount;
			
			System.out.println("New balance -> R$ " + this.balance);
		} else {
			System.out.println("Amount excedeed");
		}
		return this.balance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", balance=");
		builder.append(balance);
		builder.append("]");
		return builder.toString();
	}
}