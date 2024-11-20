/* Compile-Time Polymorphism (Static Binding):
 * Achieved through method overloading.
 * The method to be invoked is determined at compile time.
 * Example: Multiple methods with the same name but different parameter lists.
 * 
 */

package core.java.oppsconcepts;

class Calculator {
	// Method Overloading
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}
}

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		System.out.println(calc.add(10, 20));     
		System.out.println(calc.add(10, 20, 30));

	}

}
