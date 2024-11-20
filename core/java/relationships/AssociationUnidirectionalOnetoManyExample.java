package core.java.relationships;
import java.util.ArrayList;
import java.util.List;

	class Library {
	    String name;
	    List<Book1> books; // One library can have many books

	    public Library(String name) {
	        this.name = name;
	        this.books = new ArrayList<>();
	    }

	    public void addBook(Book1 book) {
	        books.add(book);
	    }

	    public void displayBooks() {
	        System.out.println("Library: " + name);
	        for (Book1 book : books) {
	            System.out.println(book.title);
	        }
	    }
	}
	class Book1 {
	    String title;
	    Library library;  

	    public Book1(String title, Library library) {
	        this.title = title;
	        this.library = library;
	    }
	}
	public class AssociationUnidirectionalOnetoManyExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library("City Library");

        // Create books and associate them with the library
        Book1 book1 = new Book1("Java Programming", library);
        Book1 book2 = new Book1("Data Structures", library);
        Book1 book3 = new Book1("Design Patterns", library);

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display all books in the library
        library.displayBooks();
		

	}

}
