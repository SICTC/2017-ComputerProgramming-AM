
public class Bird extends Dino
{
	boolean keptAsPet;
	boolean canTalk;
	
	static int birdCount = 0;
	
	public Bird(String n, String s, String c, int h, boolean p, boolean t)
	{
		super(n, s, c, h, true);
		keptAsPet=p;
		canTalk=t;
		
		birdCount++;
	}
	
	public boolean isKeptAsPet()
	{
		return keptAsPet;
	}
	
	public boolean talks()
	{
		return canTalk;
	}
	
	public int birdCount()
	{
		return birdCount;
	}
	
	public String toString()
	{
		return "Bird:" + super.toString() + ", pet=" +keptAsPet+ ", talks=" + canTalk;
	}
}
