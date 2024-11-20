/* constructors are special methods used to initialize objects. 
 * They have the same name as the class and no return type.
 * Default Constructor (No-Argument Constructor)
 * Characteristics:
 *  Takes no arguments.
 *  Initializes objects with default values.
 * 
 */
package Constructors;
	class Car {
	    String brand;
	    int speed;

	    // Default constructor
	    Car() {
	        brand = "Unknown";
	        speed = 0;
	    }

	    void display() {
	        System.out.println("Brand: " + brand + ", Speed: " + speed);
	    }
	}

public class DefaultConstructorExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();  // Default constructor is called
        car.display(); 
	}

}
