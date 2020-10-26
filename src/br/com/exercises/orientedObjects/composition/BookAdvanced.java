package br.com.exercises.orientedObjects.composition;

public class BookAdvanced {

	private String name;

	private Author[] authors;

	private double price;

	private int qty;
	
	public BookAdvanced(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	
	public BookAdvanced(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author[] getAuthors() {
		return authors;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [name=");
		builder.append(name);
		builder.append(", authors=");
		builder.append(authors);
		builder.append(", price=");
		builder.append(price);
		builder.append(", qty=");
		builder.append(qty);
		builder.append("]");
		return builder.toString();
	}	
}