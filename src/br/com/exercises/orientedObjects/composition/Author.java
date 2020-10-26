package br.com.exercises.orientedObjects.composition;

public class Author {

	private String name;

	private String email;

	private char gender;

	public Author() {

	}

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Author [name=");
		builder.append(name);
		builder.append(", email=");
		builder.append(email);
		builder.append(", gender=");
		builder.append(gender);
		builder.append("]");
		return builder.toString();
	}
}