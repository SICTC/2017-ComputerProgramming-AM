
public class Dino extends Animal
{
	int horns;
	boolean feathers;
	
	public Dino(String n, String s, String c, int h, boolean f)
	{
		super(n,s,c);
		horns = h;
		feathers = f;
	}
	
	public int getHorns()
	{
		return horns;
	}
	
	public boolean hasFeathers()
	{
		return feathers;
	}
	
	public String toString()
	{
		return "Dino:" + super.toString() + ", horns=" +horns+ ", feathers=" +feathers;
	}
	
}
