/*  SUPER():
 * Must be the first statement in a subclass constructor.
 * If a superclass has a parameterized constructor, the subclass must explicitly call it using super(). 
 * (unless the superclass also has a no-argument constructor).
 * If you don’t explicitly call super(), Java automatically inserts a call to the no-argument
 * constructor of the superclass.
 * CONSTRUCTOR CHAINING USES:
 *  Code Reusability: Reduces duplicate initialization logic.
 *  Flexibility: Simplifies complex object creation.
 *  Readability: Centralizes initialization code in a single constructor.
 */
package Constructors;

class Animal {
    String name;
    String breed;

    Animal(String name, String breed) {
    	this.name = name;
        this.breed = breed;
        System.out.println("Animal Name: " + name);
        System.out.println("Animal breed: " + breed);
    }
}

class Dog extends Animal {
    int lifespan;

    Dog(String name, String breed, int lifespan) {
        super(name, breed);
        this.lifespan = lifespan;
        System.out.println("Animal lifespan: " + lifespan);
    }
}

public class ConstructorChainingBetweenSuperandSubClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Dog dog = new Dog("DOG", "German Shepherd", 10);

	}

}
