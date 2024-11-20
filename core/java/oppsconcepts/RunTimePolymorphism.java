package core.java.oppsconcepts;

class Animal {
	void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("Cat meows");
	}
}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myAnimal;

		myAnimal = new Dog();
		myAnimal.sound();

		myAnimal = new Cat();
		myAnimal.sound();

	}

}
