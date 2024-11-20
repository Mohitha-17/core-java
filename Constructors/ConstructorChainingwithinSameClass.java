/* Constructor Chaining occurs when one constructor calls another constructor in the
 * same class (or superclass) to reuse code and reduce redundancy.
 * It helps to initialize objects efficiently by passing parameters or default values between constructors.
 * THIS():
 * Must be the first statement in the constructor.
 * It can only be used to call another constructor in the same class.
 * It cannot be used with super() in the same constructor (since both must be the first statement).
 */
package Constructors;

class Flower {
    String name;
    String color;

    Flower() {
        this("Unknown", "Unknown"); 
    }

    Flower(String name) {
        this(name, "Unknown"); 
    }

    Flower(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void display() {
        System.out.println("Flower Name: " + name + ", Color: " + color);
    }
}

public class ConstructorChainingwithinSameClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower flower1 = new Flower();               
        Flower flower2 = new Flower("Rose");          
        Flower flower3 = new Flower("Tulip", "Yellow"); 

        flower1.display(); 
        flower2.display(); 
        flower3.display();

	}

}
