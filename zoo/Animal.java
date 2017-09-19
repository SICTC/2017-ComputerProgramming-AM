
public class Animal 
{
	String name;
	String species;
	String color;
	
	public Animal(String n, String s, String c)
	{
		name=n;
		species=s;
		color=c;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getSpecies()
	{
		return species;
	}
	
	public String getColor()
	{
		return color;
	}
	
	
	public String toString()
	{
		return "Animal: name=" +name+ ", species=" +species+ ", color=" +color;
	}
}
