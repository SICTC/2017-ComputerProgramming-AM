
public class Fish extends Animal
{

	//data fields
	String name;
	String color;
	String species;
	int fins;
	int eyes;
	
	public static int fishCount = 0;
	
	//name, color, species, fins, eyes
	//primary constructor!
	public Fish(String n, String s, String c, int f, int e)
	{
		super(n,s,c);
		
		fins = f;
		eyes = e;
		
		fishCount++;
	}
	
	//observer
	//print the fish as a string
	public String toString()
	{
		return "name: " + name + ", color: " + color + ", species: " 
				+ species + ", fin count: " + fins + ", eye count: " 
				+ eyes;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public String getSpecies()
	{
		return species;
	}
	
	public int getFins()
	{
		return fins;
	}
	
	public int getEyes()
	{
		return eyes;
	}
	
	public int fishCount()
	{
		return fishCount;
	}
	
	public void swim()
	{
		System.out.println(name + " goes swimming! <>< <>< <>< ><> ><> ><>");
	}
	
	//mutator
	//makes the fishie lose a fin :(
	public void sharkAttack(boolean isEye)
	{
		if(isEye)
		{
			eyes--;
		}
		else if(fins > 0)
		{
			fins--;
		}
	}
	
	//literal mutator
	public void radiation()
	{
		//if 1, grow a fin
		//if 2, grow an eye
		int random = (int)(1 + 2*Math.random());
		
		if(random == 1)
		{
			fins++;
			System.out.println(name + " grew another fin!");
		}
		if(random == 2)
		{
			eyes++;
			System.out.println(name + " grew another eye!");
		}
	}
	
	public void fishFight(Fish f)
	{
		if(f.getFins() > fins)
		{
			System.out.println(f.getName() + " wins the fish fight!");
		}
		else if(f.getFins() < fins)
		{
			System.out.println(name + " wins the fish fight!");
		}
		else if(f.getEyes() > eyes) //equal number of fins, so check eyes
		{
			System.out.println(f.getName() + " wins the fish fight!");
		}
		else if(f.getEyes() < eyes)
		{
			System.out.println(name + " wins the fish fight!");
		}
		else //same number of eyes and fins
		{
			System.out.println("Caught in a net! Everyone loses!");
		}
		
	}
	
}
