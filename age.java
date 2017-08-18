import java.util.Scanner;

public class age 
{
	
	//ask the user their age, and then tell them if they're young or old
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
		
		int age = cin.nextInt();
		
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
		
		cin.close();
	}
}
