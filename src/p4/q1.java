package p4;

import java.util.Scanner;

public class q1 {
	//checks whether an int is prime or not.

	public static boolean isPrime(int n) {
		for(int i=2;2*i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}


	public static void main(String[] args) {
		
		int numberOfTimes = 0; 
		do {
			numberOfTimes++; 
			// Read a number
			Scanner input = new Scanner(System.in);
			System.out.print("enter a whole number:");
			int num = input.nextInt();


			if (isPrime(num))
				System.out.println( num + " is a prime number" );
			else 
				System.out.println(num +" is NOT a prime number" );
			
			if (numberOfTimes == 3)
				break;
		} while (true);
	}

}
