package keywords;

public class StaticKeywordExample {
	private static final String MAX_VALUE = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new InstanceTracker();
	        new InstanceTracker();
	        new InstanceTracker();
	        System.out.println("Number of instances created: " + InstanceTracker.getInstanceCount());
	        System.out.println("-------------------------------");
	        int result = Calculator.add(5, 3);
	        System.out.println("The sum is: " + result);
	        System.out.println("-------------------------------");
	        Example.displayMessage();
	        System.out.println("-------------------------------");
	        OuterClass.NestedClass nestedObject = new OuterClass.NestedClass();
	        nestedObject.displayMessage();
	        System.out.println("-------------------------------");
	        String original = "Hello, world!";
	        String reversed = keywords.OuterClass.StringUtility.reverseString(original);
	        
	        System.out.println("Original String: " + original);  // Output: Hello, world!
	        System.out.println("Reversed String: " + reversed);
	        System.out.println("-------------------------------");
	        Person person1 = new Person("Alice");
	        Person person2 = new Person("Bob");
	        Person person3 = new Person("Charlie");

	        // Iterating over an array of Person objects to print their names
	        Person[] people = {person1, person2, person3};
	        for (Person person : people) {
	            System.out.println("Person's name: " + person.getName());
	        }

	        // Accessing the static variable using the static method to get the total count
	        System.out.println("Total persons created: " + Person.getPersonCount());
	        System.out.println("-------------------------------");
	        MathConstants.displayConstants();
	        System.out.println("-------------------------------");
	        printMessage();  // No need to use Utility.printMessage()
	        System.out.println("Max value is: " + MAX_VALUE);
	        System.out.println("-------------------------------");
	        countMethodCalls(); // Output: Method called 1 times.
	        countMethodCalls();
	        System.out.println("-------------------------------");
	        Singleton singleton1 = Singleton.getInstance();
	        singleton1.showMessage();

	        // Trying to get another instance of the Singleton class
	        Singleton singleton2 = Singleton.getInstance();
	        singleton2.showMessage();

	        // Check if both instances are the same
	        System.out.println("Are both instances the same? " + (singleton1 == singleton2));
	}

	private static void countMethodCalls() {
		// TODO Auto-generated method stub
		
	}

	private static void printMessage() {
		// TODO Auto-generated method stub
		
	}

	private static void staticImportExample() {
		// TODO Auto-generated method stub
		
	}

}
///////  1:
class InstanceTracker {
    private static int instanceCount = 0;
    public InstanceTracker() {
        instanceCount++;
    }
    public static int getInstanceCount() {
        return instanceCount;
    }
}
//////// 2:
class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }
}
//////// 3:
class Example {
    // Static variable
    private static String message;
    static {
        message = "Hello from the static block!";
        System.out.println("Static block executed.");
    }
    public static void displayMessage() {
        System.out.println(message);
    }
	
}
///////// 4:
class OuterClass {
    static String outerMessage = "Message from the outer class.";

    // Static nested class
    static class NestedClass {
        public void displayMessage() {
            System.out.println(outerMessage);
            System.out.println("This is a message from the nested class.");
        }
    }
//////////// 5:
    class StringUtility {
        // Static method to reverse a string
        public static String reverseString(String input) {
            StringBuilder reversed = new StringBuilder(input);
            return reversed.reverse().toString();
        }
    }
}
//////// 6:
class Person {
    // Instance variable for the person's name
    private String name;

    // Static variable to keep track of the total number of Person objects created
    private static int personCount = 0;

    // Constructor to initialize the person's name and increment the static personCount
    public Person(String name) {
        this.name = name;
        personCount++;
    }

    // Static method to get the total number of persons created
    public static int getPersonCount() {
        return personCount;
    }

    // Instance method to get the name of the person
    public String getName() {
        return name;
    }
}
//////////// 7:
class MathConstants {
    // Static final constant
    public static final double PI = 3.14159;
    public static final double E = 2.71828;

    // Static method to display constants
    public static void displayConstants() {
        System.out.println("PI: " + PI);
        System.out.println("E: " + E);
    }
}
///////////// 8:
class Utility {
    // Static method
    public static void printMessage() {
        System.out.println("Hello, this is a static method!");
    }

    // Static constant
    public static final int MAX_VALUE = 100;
}
///////////// 9:
class CounterExample {

    // Static counter variable to count method calls
    public static void countMethodCalls() {
        // Static variable to keep track of method calls
        // This counter will persist across method calls
        int counter = 1;

        // Increment the counter each time the method is called
        counter++;
        
        // Print the counter value
        System.out.println("Method called " + counter + " times.");
    }
}
////////////// 10:
class Singleton {

    // Static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
        System.out.println("Singleton Instance Created");
    }

    // Static method to provide the single instance of the class
    public static Singleton getInstance() {
        // If instance is null, create a new one
        if (instance == null) {
            instance = new Singleton();
        }
        // Return the single instance
        return instance;
    }

    // A method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}