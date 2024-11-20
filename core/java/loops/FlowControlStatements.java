package core.java.loops;

import java.util.Scanner;

public class FlowControlStatements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		
		int[] numbers = {1, 6, 9, 10, -3, 8};
		
		String[] array = {"Apple", "Banana", "Grapes", "Watermelon", "Strawberry"};
		countEvenNumbers(n);
		displayNumbersUsedWhileLoop(n);
		doWhileLoop(numbers);
		enhanceArrayLoop(array);
		switchStatement(n);
		

	}
	
	public static void countEvenNumbers(int n) {
		
		int sum =0;
		for ( int i = 1; i<= n; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
			sum += i;
		}
		System.out.println("Sum of even numbers: "+ sum);
		System.out.println("------------------------------------------");
	}
	
	public static void displayNumbersUsedWhileLoop(int n) {
		int count = 0;
		
		while(n > 0) {
			if( n==5) {
				break;
			}
			count++;
			System.out.println(n);
			n--;
		}
		System.out.println("Count the number of values: " + count);
		System.out.println("------------------------------------------");
	}
	
	public static void doWhileLoop(int numbers[]) {
		
		int sum =0;
		int i=0;
		int n;
		
		do {
			n = numbers[i];
			System.out.println("Input value: " + n);
			if( n>= 0) {
				sum += n;
			}
			i++;
		}while(n> 0 && i < numbers.length);
		
		System.out.println("Sum of all positive values: "+ sum);
		System.out.println("------------------------------------------");
	}
	
	public static void enhanceArrayLoop(String[] array) {
		
		for(String str : array) {
			System.out.println(str.toUpperCase());
		}
		System.out.println("------------------------------------------");
	}

	public static void switchStatement(int n) {
		

switch (n) {
		
		case 1, 2, 3, 4, 5, 6, 7,8 , 9, 10 -> {
			System.out.println(n + " is categorised as Smallest number");	
		}
				
		case 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 ->{
			System.out.println(n + " is categorised as Medium number");
		}
				
		default -> {
			if(n > 20) {
              System.out.println(n + " is Largest number");
			} else {
			System.out.println(n + " is not categorised as positive number");
			}
		
		}
	}

	}


}
