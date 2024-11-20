/* The synchronized keyword ensures that only one thread can access the shared resource
 * (such as variables, methods, or objects) at a time. 
 * This prevents the conflicts that arise when multiple threads interact with shared data.
 * Reasons to use SYNCHRONISED:
 * Thread Safety , Preventing Race Conditions , Atomic Operations.
 */
package keywords;
public class SynchronizedKeywordExample {
    private double balance;

    public SynchronizedKeywordExample(double initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized method to display account balance
    public synchronized void displayBalance() {
        System.out.print(Thread.currentThread().getName() + " - Balance: " + balance + " | ");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizedKeywordExample account = new SynchronizedKeywordExample(1000);
        Thread thread1 = new Thread(() -> account.displayBalance(), "Thread-1");
        Thread thread2 = new Thread(() -> account.displayBalance(), "Thread-2");

        thread1.start();
        thread2.start();

	}
  }



