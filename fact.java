import java.util.Scanner;

public class fact {

	//idea:  what if we have a function that calls itself?
	//this is called recursion, and is a VITAL resource in computer science
	
	//rules for recursion
	//1. Always have a base case
	//2. Always converge toward the base case
	//3. Avoid repeated work
	//4. Believe in recursion
	
	//recursive function to compute the factorial of a number
	static int factorial(int n)
	{
		if(n<=1)
		{
			System.out.println("Base case");
			return 1;
		}
		else
		{
			System.out.println("n="+n);
			return n*factorial(n-1);
		}
	}
	
	
	//very inefficient, lots of repeated work
	static int fibonacci(int n)
	{
		if(n==1 || n==0)
		{
			System.out.println("Base case");
			return 1;
		}
		else
		{
			System.out.println("Computing " + n + "th fibonacci number...");
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	public static void main(String [] args)
	{
		//compute the factorial of a number
		Scanner cin = new Scanner(System.in);
		
		int n = cin.nextInt();
		
		//System.out.println(factorial(n));
		System.out.println(fibonacci(n));
		
		cin.close();
		
	}
}
