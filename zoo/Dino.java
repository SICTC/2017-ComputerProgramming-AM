
public class Dino extends Animal
{
	int horns;
	boolean feathers;
	
	static int dinoCount = 0;
	
	public Dino(String n, String s, String c, int h, boolean f)
	{
		super(n,s,c);
		horns = h;
		feathers = f;
		
		dinoCount++;
	}
	
	public int getHorns()
	{
		return horns;
	}
	
	public boolean hasFeathers()
	{
		return feathers;
	}
	
	public int dinoCount()
	{
		return dinoCount;
	}
	
	public String toString()
	{
		return "Dino:" + super.toString() + ", horns=" +horns+ ", feathers=" +feathers;
	}
	
}
