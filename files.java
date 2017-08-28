import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class files 
{

	public static void main(String[] args) throws IOException
	{
		int n = 10000;
		int [] a = new int[n];
		
		for(int i = 0; i<n; i++)
		{
			a[i]=(int)(1+100*Math.random());
			//System.out.println(a[i]);
		}
		
		FileWriter fout = new FileWriter("textfile.txt");
		
		for(int i = 0; i<n; i++)
		{
			fout.write((String.valueOf(a[i]))+'\n');
		}
		
		fout.flush();
		
		fout.close();
		
		Scanner fin = new Scanner(new FileReader("textfile.txt"));
		
		do
		{
			System.out.println(fin.nextLine());
		}
		while(fin.hasNextLine());
		
		fin.close();
		
	}

}
