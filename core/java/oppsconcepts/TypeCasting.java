package core.java.oppsconcepts;

class Fruit {
	public void crunch() {
		System.out.println("Fruit is Crunchy");
	}
}

class Apple extends Fruit {
	public void crunch() {
		System.out.println("Apple is crunchy");
	}

	public void sweet() {
		System.out.println("Apple is sweet");
	}
}

class Orange extends Fruit{
	public void juice(){
		System.out.println("Orange is juicy");
	}
}

public class TypeCasting {
	public static void main(String[] args) {

		//  widening
		int a = 10;
		double b = a;
		System.out.println("widening (int to double): " + b);

		//  narrowing
		double d = 5.5;
		int i = (int) d;
		System.out.println("Narrowing (double to int): " + i);

		//  Upcasting
		Fruit myApple = new Apple();
		myApple.crunch();

		//  Downcasting
		if(myApple instanceof Apple) {
			Apple specificApple = (Apple) myApple;
			specificApple.sweet();
		}

		Fruit myOrange = new Orange();

		if(myOrange instanceof Orange) {
			Orange specificOrange = (Orange) myOrange;
			specificOrange.juice();
		}
	}


}
