/*When to use:
 * To refer to instance variables.
 * In constructor chaining.
 * To invoke current class methods.
 * To pass the current object to another method.
 */





package keywords;
abstract class Vehicle {
    abstract void startEngine();
    void displayType() {
        System.out.println("This is a vehicle.");
    }
}
class Car extends Vehicle {
    private String brand;
    Car(String brand) {
        this.brand = brand;
    }
    @Override
    void startEngine() {
        System.out.println(brand + " Car engine is starting with a key");
    }
	public void updateYear(int i) {
		// TODO Auto-generated method stub
		
	}
}
class Motorcycle extends Vehicle {
    private String brand;
    Motorcycle(String brand) {
        this.brand = brand;
    }
    @Override
    void startEngine() {
        System.out.println(brand + " Motorcycle engine is starting with a kickstart.");
    }
}
public class AbstractKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Car("Toyota");
        Vehicle motorcycle = new Motorcycle("Honda");
        car.displayType();
        car.startEngine();
        motorcycle.displayType();
        motorcycle.startEngine();
	}
}
