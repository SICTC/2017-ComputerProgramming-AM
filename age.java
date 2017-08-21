import java.util.Scanner; //need scanner to read user input

public class age 
{
	
	//ask the user their age, and then tell them if they're young or old
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in); //initialize scanner---cin is a standard name for reading from the terminal
		
		int age = cin.nextInt(); //read in the next int from the terminal
		
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
		
		cin.close(); //be sure to close the scanner when you are finished using it
	}
}
