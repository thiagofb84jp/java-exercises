package br.com.exercises.orientedObjects.composition;

public class TestAuthor {

	public static void main(String[] args) {
		/*
		 * Author 1
		 */
		Author author1 = new Author("Agatha Chirstie", "christie.agatha@email.com", 'f');
		System.out.println(author1  + "\n");

		/*
		 * Author 2
		 */
		Author author2 = new Author("Dan Brown", "someEmail@email.com", 'm');
		author2.setEmail("dan.brown@email.com");
		System.out.println("Name is: " + author2.getName());
		System.out.println("Email is: " + author2.getEmail());
		System.out.println("Gender is: " + author2.getGender() + "\n");

		/*
		 * Author 3 (With Book)
		 */
		Author author3 = new Author("Stendal", "stendal@email.com", 'm');
		System.out.println(author3 + "\n");
		
		Book bookAuthor3 = new Book("O Vermelho e o Negro", author3, 87.55);
		System.out.println(bookAuthor3);
		
		bookAuthor3.setPrice(29.66);
		bookAuthor3.setQty(29);
		
		System.out.println("Name is: " + bookAuthor3.getName());
		System.out.println("Price is: " + bookAuthor3.getPrice());
		System.out.println("Qty is: " + bookAuthor3.getQty());
		
		System.out.println("Author is: " + bookAuthor3.getAuthor());
		System.out.println("Author's name is: " + bookAuthor3.getAuthor().getName());
		System.out.println("Author's email is: " + bookAuthor3.getAuthor().getEmail() + "\n");

		/*
		 * Author 4 (With Book)
		 */
		Book anotherBook = new Book("O Retrato de Dorian Gray", new Author("Oscar Wilde", "oscar.wilde@email.com", 'm'), 85.55, 2);
		System.out.println(anotherBook);
		
		System.out.println("Author's name is: " + anotherBook.getAuthorName() + "\n");
		
		/*
		 * Book Advanced
		 * Challenge - How can I get the Author's name? Find a help with Paulo (Collection)
		 */
		Author[] authors = new Author[2];
		authors[0] = new Author("José Cabral de Melo Neto", "jose.neto@email.com", 'm');
		authors[1] = new Author("Rachel de Queiróz", "rachel.queiroz@email.com", 'f');
		
		BookAdvanced bookAdvanced = new BookAdvanced("Morte e Vida Severina", authors, 89.44, 2);
		System.out.println(bookAdvanced);
	}
}