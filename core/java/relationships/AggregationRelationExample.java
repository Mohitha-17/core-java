/* HAS-A RELATION:
 * independent like cycle.
 * where one class has a reference to another class, but the referenced class can exist independently.
 * 
 */
package core.java.relationships;
import java.util.ArrayList;
import java.util.List;
class Fruit {
    String name;
    String color;

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void displayFruit() {
        System.out.println("Fruit: " + name + " | Color: " + color);
    }
}
class Basket {
    String basketType;
    List<Fruit> fruits; 

    public Basket(String basketType) {
        this.basketType = basketType;
        this.fruits = new ArrayList<>();
    }

    // Method to add a fruit to the basket
    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    // Method to display all fruits in the basket
    public void displayFruits() {
        System.out.println("Basket Type: " + basketType);
        for (Fruit fruit : fruits) {
            fruit.displayFruit();
        }
    }
}

public class AggregationRelationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit fruit1 = new Fruit("Apple", "Red");
        Fruit fruit2 = new Fruit("Banana", "Yellow");
        Fruit fruit3 = new Fruit("Orange", "Orange");
        Basket basket = new Basket("Fruit Basket");
        basket.addFruit(fruit1);
        basket.addFruit(fruit2);
        basket.addFruit(fruit3);
        basket.displayFruits();
        System.out.println("Displaying fruits outside the basket:");
        fruit1.displayFruit();
        fruit2.displayFruit();
        fruit3.displayFruit();

	}

}
