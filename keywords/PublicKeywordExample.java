/*
 * Public Class: A public class can be accessed from any other class in the program.
 * Public Method: A public method can be invoked from anywhere in the program, including other classes and packages.
 * Public Field: A public field can be accessed and modified directly from anywhere in the program.
 * Public Constructor: A public constructor allows instantiating the class from any other class.
 */

package keywords;
public class PublicKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("Java Programming");
        book.display();
	}
}


class Book {
    private String title;

    // Public constructor
    public Book(String title) {
        this.title = title;
    }

    // Public method to display the book title
    public void display() {
        System.out.println("Book title: " + title);
    }
}