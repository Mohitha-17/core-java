

package keywords;

public class PrivateKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Singleton1 singleton = Singleton1.getInstance();
	        System.out.println("Singleton instance: " + singleton);
	}
}
class Singleton1 {
    // Private static instance variable
    private static Singleton1 instance;

    // Private constructor to prevent instantiation from outside
    private Singleton1() {}

    // Public method to provide access to the single instance
    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}

