import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class files 
{

	public static void main(String[] args) throws IOException
	{
		int n = 10000; //avoid "magic numbers". use a variable where you would repeat constants in loops, etc.
		
		int [] a = new int[n]; //declare an array of length n
		
		//populate the array using a for loop
		for(int i = 0; i<n; i++)
		{
			a[i]=(int)(1+100*Math.random());
			//System.out.println(a[i]);
		}
		
		//write the elements of the array to a text file
		FileWriter fout = new FileWriter("textfile.txt");
		
		for(int i = 0; i<n; i++)
		{
			//use the String.valueOf() function to avoid the writer trying to interperate the int values as characters
			fout.write((String.valueOf(a[i]))+'\n');
		}
		
		fout.flush(); //make sure everything in the filewriter has actually been written
		
		fout.close();
		
		Scanner fin = new Scanner(new FileReader("textfile.txt"));
		
		do //read in each line of the text file and print it
		{
			System.out.println(fin.nextLine());
		}
		while(fin.hasNextLine());
		
		fin.close();
		
	}

}
