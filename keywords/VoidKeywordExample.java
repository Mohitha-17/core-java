
/* Purpose: void is used when a method performs a task but doesn't need to send back any data.
 * Usage: Commonly used in methods like printing data, modifying object state, or 
 * other side-effect-driven actions.
 * 
 */
package keywords;

public class VoidKeywordExample {
	
	public void printMessage() {
        System.out.println("Hello, this is a void method!");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoidKeywordExample example = new VoidKeywordExample();
	        example.printMessage();

	}
}
