/* Parameterized Constructor
 * This constructor takes arguments to initialize an object with specific values.
 * Characteristics:
 * -> Allows initializing variables with user-defined values.
 * -> Overcomes the limitation of default initialization.
 * 
 */
package Constructors;

class Car1 {
    String brand;
    int speed;

    // Parameterized constructor
    Car1(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}

public class ParameterizedConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car1 car = new Car1("Toyota", 120);  // Parameterized constructor is called
	        car.display();

	}

}
