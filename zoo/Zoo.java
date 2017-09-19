
public class Zoo 
{
	
	static Animal generateAnimal()
	{
		return new Dino("Blue2", "Velociraptor", "blue", 0, true);
	}
	
	public static void main(String [] args)
	{
		Animal dog = new Animal("Fido", "Doge", "Spotted");
		
		Dino raptor = new Dino("Blue", "Velociraptor", "blue", 0, true);
		
		Bird cardinal = new Bird("Fred", "Cardinal", "red", 0, false, false);
		
		System.out.println(dog);
		System.out.println(raptor);
		System.out.println(cardinal);
		
		System.out.println(cardinal.getName());
		System.out.println(cardinal.getHorns());
		
		System.out.println(generateAnimal());
	}
}
