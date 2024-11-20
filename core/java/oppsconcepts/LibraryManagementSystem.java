package core.java.oppsconcepts;

import java.util.ArrayList;

/**
 * Base class representing a book in the library.
 * Provides methods to get book details and manage availability status.
 */
class Book {

	private String title;
	private String author;
	private String isbn;
	private boolean isAvailable;

	/**
	 * Constructor to initialize a book with the given title, author, and ISBN.
	 * The availability is set to true by default.
	 * 
	 * @param title the title of the book
	 * @param author the author of the book
	 * @param isbn the ISBN of the book
	 */
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isAvailable = true;
	}

	/**
	 * Gets the details of the book.
	 * 
	 * @return a string containing the book's title, author, and ISBN
	 */
	public String getBookDetails() {
		return "Book Name: " + title + ", Author Name: " + author + ", ISBN: " + isbn + " ,";
	}

	/**
	 * Sets the availability status of the book.
	 * 
	 * @param status the availability status of the book
	 */
	public void setBookAvailability(boolean status) {
		this.isAvailable = status;
	}

	/**
	 * Gets the availability status of the book.
	 * 
	 * @return true if the book is available, false otherwise
	 */
	public boolean isAvailable() {
		return this.isAvailable;
	}
}

/**
 * Class representing an eBook, which extends the Book class.
 * Adds functionality to manage file size specific to eBooks.
 */
class EBook extends Book {

	private double fileSize;

	/**
	 * Constructor to initialize an eBook with the given title, author, ISBN, and file size.
	 * 
	 * @param title the title of the eBook
	 * @param author the author of the eBook
	 * @param isbn the ISBN of the eBook
	 * @param fileSize the file size of the eBook in MB
	 */
	public EBook(String title, String author, String isbn, double fileSize) {
		super(title, author, isbn);
		this.fileSize = fileSize;
	}

	/**
	 * Gets the details of the eBook, including the file size.
	 * 
	 * @return a string containing the eBook's details along with the file size
	 */
	@Override
	public String getBookDetails() {
		return super.getBookDetails() + "File Size: " + fileSize + " MB ,";
	}
}

/**
 * Library class representing a collection of books.
 * Provides methods to add books and display details of all books in the library.
 */
class Library {

	private ArrayList<Book> books;

	/**
	 * Constructor to initialize the library with an empty list of books.
	 */
	public Library() {
		this.books = new ArrayList<>();
	}

	/**
	 * Adds a book (either regular or eBook) to the library.
	 * 
	 * @param book the book to be added to the library
	 */
	public void addBook(Book book) {
		books.add(book);
	}

	/**
	 * Displays details of all the books in the library.
	 * For each book, it shows the book details along with its availability status.
	 */
	public void displayBooks() {
		for (Book book : books) {
			System.out.println(book.getBookDetails() + "Availability: " + book.isAvailable());
		}
	}
}

/**
 * Main class to demonstrate the functionality of the LibraryManagementSystem.
 * It adds books to the library and displays their details.
 */
public class LibraryManagementSystem {

	/**
	 * The main method to demonstrate the functionality of adding books to the library
	 * and displaying their details.
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
		Library library = new Library();

		// Instances of Book and EBook
		Book book1 = new Book("ABC", "RBN Tagore", "1234");
		EBook ebook1 = new EBook("XYZ", "R Sharma", "5678", 1.7);

		// Add books to the library
		library.addBook(book1);
		library.addBook(ebook1);

		// Display the details of all books in the library
		library.displayBooks();
	}
}
