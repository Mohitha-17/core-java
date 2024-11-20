/*try block:
Contains the code that may throw an exception.
If an exception occurs, the program control is transferred to the corresponding catch block.

catch block:
Handles specific exceptions.
You can have multiple catch blocks to handle different types of exceptions.

finally block:
Contains code that will always execute, regardless of whether an exception was thrown or not.
Typically used for cleanup operations, like closing a file or releasing a database connection.
 * 
 */
package keywords;

public class TryCatchFinallyKewordExample {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3};
		
		try {
			
			System.out.println("Accessing element at index 3: " + numbers[3] );
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Exception caught: " + e.getMessage());
			
		} finally {
			
			System.out.println("The 'finally' block is always executed.");
		}
		
		System.out.println("Program continues after try-catch-finally");

	}

}