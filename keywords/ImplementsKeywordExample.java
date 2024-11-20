package keywords;

public class ImplementsKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Animal dog = new Dog();
	        dog.sound();
	        dog.move();
	}
}
interface Animal {
    void sound();
    void move();
}
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
    @Override
    public void move() {
        System.out.println("Dog runs.");
    }
}

