import java.util.Scanner;

public class fun 
{
	//functions go outside the main method, but still inside the class body
	//modifier returnType name(argType1 arg1, argType2 arg2, ...)
	//{
	//	//method body
	//}
	
	//function to change lowercase text to uppercase text
	static String upper(String text)
	{
		String answer = text.toUpperCase();
		
		return answer;
	}
	
	static double earthToMars(double age)
	{
		return age/1.88;
	}
	
	static void areYouOld(double age)
	{
		if(age<0)
		{
			System.out.println("You don't exist yet...");
		}
		else if(age<12)
		{
			System.out.println("You're still young!");
		}
		else if(age < 20)
		{
			System.out.println("You're a teenager!");
		}
		else if(age > 50)
		{
			System.out.println("Wow, you're old!");
		}
		else
		{
			System.out.println("Middle of the road");
		}
	}
	
	
	//functions and methods in java
	//
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);
		
		//String text = cin.nextLine();
		
		//System.out.println(upper(text));
		
		System.out.println("Enter your age in earth years");
		int earth = cin.nextInt();
		
		double mars = earthToMars((double)earth);
		
		System.out.println("Earth age: " + earth);
		areYouOld(earth);
		
		System.out.println("Mars age: " + mars);
		areYouOld(mars);
		
		cin.close();
	}

}
