
public class Animal 
{
	String name;
	String species;
	String color;
	
	static int animalCount = 0;
	
	public Animal(String n, String s, String c)
	{
		name=n;
		species=s;
		color=c;
		
		animalCount++;
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
	
	public int animalCount()
	{
		return animalCount;
	}
	
	
	public String toString()
	{
		return "Animal: name=" +name+ ", species=" +species+ ", color=" +color;
	}
}
