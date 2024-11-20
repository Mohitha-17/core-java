/* Copy Constructor:
 * This is used to create a new object as a copy of an existing object. 
 * Java does not provide a predefined copy constructor, but you can define one manually.
 * Characteristics:
 * Takes an object of the same class as a parameter.
 * Copies values from one object to another.
 * 
 */
package Constructors;
class Chocolate {
    String name;
    double price;

    // Parameterized constructor
    Chocolate(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Copy constructor
    Chocolate(Chocolate chocolate) {
        this.name = chocolate.name;
        this.price = chocolate.price;
    }

    void display() {
        System.out.println("Name: " + name + ", Price: " + price + "RS");
    }
}

public class CopyConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate choco1 = new Chocolate("Dairy Milk", 20);
        // Using copy constructor
        Chocolate choco2 = new Chocolate(choco1);

        choco1.display();
        choco2.display();

	}

}
