package core.java.oppsconcepts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

/**
 * Abstract class representing a bank account.
 * Provides functionality like deposit, withdrawal, and transaction history.
 */
abstract class Account {
	private String accountNumber;
	private double balance;
	private List<String> transactionHistory;

	/**
	 * Constructor to initialize an account with default values.
	 * @param accountNumber 
	 * @param balance 
	 */
	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.transactionHistory = new ArrayList<>();
	}

	/**
	 * Abstract method to get the account type. Must be implemented by subclasses.
	 * 
	 * @return the type of the account as a String
	 */
	public abstract String getAccountType();

	/**
	 * Deposits the specified amount into the account.
	 * 
	 * @param amount the amount to deposit
	 */
	public void deposite(double amount) {
		if (amount > 0) {
			balance += amount;
			recordTransaction("deposit", amount);
		} else {
			System.out.println("Deposit amount must be positive");
		}
	}

	/**
	 * Withdraws the specified amount from the account and records the transaction.
	 * 
	 * @param amount the amount to withdraw, cannot exceed current balance
	 */
	public void withdraw(double amount) {
		if (balance > 0) {
			if (balance >= amount) {
				balance -= amount;
				recordTransaction("withdrawal", amount);
			} else {
				System.out.println("Insufficient balance");
			}
		}
	}

	/**
	 * Records the transaction by adding its type, amount, and timestamp to the transaction history.
	 * 
	 * @param type   the type of the transaction (e.g., "deposit" or "withdrawal")
	 * @param amount the amount involved in the transaction
	 */
	private void recordTransaction(String type, double amount) {
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		transactionHistory.add("Date: " + timestamp + ", Type: " + type + ", Amount: " + amount);
	}

	/**
	 * Gets the account number.
	 * 
	 * @return the account number as a string
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Gets the current balance of the account.
	 * 
	 * @return the balance as a double
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Gets the transaction history of the account.
	 * 
	 * @return list of Strings representing the transaction history
	 */
	public List<String> getTransactionHistory() {
		return transactionHistory;
	}
}

/**
 * Class representing a Savings Account.
 * Inherits from the abstract class Account.
 */
class SavingsAccount extends Account {

	/**
	 * Constructor to initialize account number and initial balance.
	 * 
	 * @param accountNumber the account number for the Savings Account
	 * @param initialBalance the initial balance of the account
	 */
	public SavingsAccount(String accountNumber, double initialBalance) {
		super(accountNumber, initialBalance);
	}

	/**
	 * Gets the account type.
	 * 
	 * @return the account type as a String "Savings"
	 */
	public String getAccountType() {
		return "Savings";
	}
}

/**
 * Class representing a Current Account.
 * Inherits from the abstract class Account.
 */
class CurrentAccount extends Account {

	/**
	 * Constructor to initialize account number and initial balance.
	 * 
	 * @param accountNumber the account number for the Current Account
	 * @param initialBalance the initial balance of the account
	 */
	public CurrentAccount(String accountNumber, double initialBalance) {
		super(accountNumber, initialBalance);
	}

	/**
	 * Gets the account type.
	 * 
	 * @return the account type as a String "Current"
	 */
	public String getAccountType() {
		return "Current";
	}
}

/**
 * Class representing a Fixed Deposit Account.
 * Inherits from the abstract class Account.
 * Adds maturity time for withdrawals.
 */
class FixedDepositeAccount extends Account {
	private long maturityTime;

	/**
	 * Constructor to initialize account number, initial balance, and maturity time.
	 * 
	 * @param accountNumber the account number for the Fixed Deposit Account
	 * @param initialBalance the initial balance of the account
	 * @param maturityTime the maturity time in days from account creation
	 */
	public FixedDepositeAccount(String accountNumber, double initialBalance, long maturityTime) {
		super(accountNumber, initialBalance);
		this.maturityTime = System.currentTimeMillis() + (maturityTime * 24L * 60L * 60L * 1000L);
	}

	/**
	 * Gets the account type.
	 * 
	 * @return the account type as a String "Fixed Deposit"
	 */
	public String getAccountType() {
		return "Fixed Deposit";
	}

	/**
	 * Withdraws a specified amount from the account if the maturity time is completed.
	 * Overrides the withdraw method in the Account class.
	 * 
	 * @param amount the amount to withdraw
	 */
	@Override
	public void withdraw(double amount) {
		long currentTime = System.currentTimeMillis();
		if (currentTime >= maturityTime) {
			super.withdraw(amount);
		} else {
			System.out.println("Cannot withdraw before maturity time.");
		}
	}
}

/**
 * Main class to demonstrate the functionalities of the bank account system.
 */
public class AccountDetails {

	/**
	 * Main method to perform specific operations on the Accounts.
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
		SavingsAccount savings = new SavingsAccount("SVA001", 1000);
		System.out.println("======Savings Account Details======");
		savings.deposite(500);
		savings.withdraw(200);
		printAccountDetails(savings);
		CurrentAccount current = new CurrentAccount("CUR001", 2000);
		System.out.println("======Current Account Details======");
		current.deposite(1000);
		current.withdraw(500);
		printAccountDetails(current);
		FixedDepositeAccount fixedDeposite = new FixedDepositeAccount("FAX001", 5000, 365);
		System.out.println("======Fixeddeposite Account Details======");
		fixedDeposite.withdraw(1000);
		printAccountDetails(fixedDeposite);
	}

	/**
	 * Prints the details of the account including account type, account number, balance, and transaction history.
	 * 
	 * @param account the account whose details need to be printed
	 */
	public static void printAccountDetails(Account account) {
		System.out.println("Account Type: " + account.getAccountType());
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Balance: " + account.getBalance());
		System.out.println("Transaction History: ");
		for (String transaction : account.getTransactionHistory()) {
			System.out.println(transaction);
		}
		System.out.println();
	}
}
