package keywords;

public class ProtectedKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog2 dog = new Dog2("Tommy");
        dog.display();
	}
}
class Animal2 {
    // Protected instance variable
    protected String name;

    // Constructor
    Animal2(String name) {
        this.name = name;
    }

    // Protected method
    protected void makeSound() {
        System.out.println("Animals make sounds");
    }
}

class Dog2 extends Animal2 {
    // Constructor for Dog class
    Dog2(String name) {
        super(name);  // Calling superclass constructor
    }

    // Method to display dog details
    void display() {
        System.out.println("Dog's name: " + name);
        makeSound();
    }
}
