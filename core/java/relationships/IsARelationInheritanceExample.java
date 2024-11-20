/* IS-A RELATION:
 * Subclass inherits from super class.subclass having all the elements of super class, and also having
 * its own elements.
 * 
 */

package core.java.relationships;

	class Animal {
	    String name;

	    public Animal(String name) {
	        this.name = name;
	    }

	    public void eat() {
	        System.out.println(name + " is eating.");
	    }

	    public void sleep() {
	        System.out.println(name + " is sleeping.");
	    }
	}
	class Bird extends Animal {
	    String type;

	    public Bird(String name, String type) {
	        super(name); 
	        this.type = type;
	    }

	    public void fly() {
	        System.out.println(name + " is flying.");
	    }
	    @Override
	    public void eat() {
	        System.out.println(name + " is eating food.");
	    }
	}
public class IsARelationInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Animal animal = new Animal("Animal");
	        animal.eat();
	        animal.sleep();
            System.out.println();
	        Bird bird = new Bird("Sparrow", "Small");
	        bird.eat(); 
	        bird.sleep();
	        bird.fly();

	}

}
