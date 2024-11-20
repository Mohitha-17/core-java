/*
 *The instanceof keyword in Java is used to test whether an object is an instance of a particular class,
 *subclass, or implements a specific interface.
 *we can use it for type checking,polymorphism,safetypecating,handling multiple object types.
 */
package keywords;

public class InstanceofKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 animal = new Dog1(); // Upcasting
        if (animal instanceof Dog1) {
            System.out.println("This animal is a Dog.");
        } else if (animal instanceof Animal1) {
            System.out.println("This animal is an Animal.");
        }
	}
}
class Animal1 {
    void sound() {
        System.out.println("Animal makes sound.");
    }
}

class Dog1 extends Animal1 {
    void sound() {
        System.out.println("Dog barks.");
    }
}
