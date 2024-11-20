package core.java.relationships;

import java.util.ArrayList;
import java.util.List;


class Author {
    String name;
    List<Book> books; 

    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Author: " + name);
        for (Book book : books) {
            System.out.println(book.title);
        }
    }
}
class Book {
    String title;
    Author author;  

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
        author.addBook(this); 
    }
}
public class AssociationBidirectionalExample {
	public static void main(String[] args) {
        Author author = new Author("Someone");
        Book book1 = new Book("BOOK1", author);
        Book book2 = new Book("BOOK2", author);

        // Display all books written by the author
        author.displayBooks();
	}
}
