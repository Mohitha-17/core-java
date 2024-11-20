package Constructors;

class Biscuit {
    String name;
    double price;

    // Constructor 1: No-argument constructor
    Biscuit() {
        name = "Unknown";
        price = 0;
    }

    // Constructor 2: Constructor with 1 parameter
    Biscuit(String name) {
        this.name = name;
        price = 15; 
    }

    // Constructor 3: Constructor with 2 parameters
    Biscuit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Biscuit Name: " + name + ", Price: " + price + "RS");
    }
}
public class ConstructorOverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Biscuit biscuit1 = new Biscuit();                  
	        Biscuit biscuit2 = new Biscuit("Oreo");              
	        Biscuit biscuit3 = new Biscuit("Digestive", 10);   

	        biscuit1.display(); 
	        biscuit2.display(); 
	        biscuit3.display(); 

	}

}
