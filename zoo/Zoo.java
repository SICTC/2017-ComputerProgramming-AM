
public class Zoo 
{
	
	static Animal generateAnimal()
	{
		return new Dino("Blue2", "Velociraptor", "blue", 0, true);
	}
	
	public static void main(String [] args)
	{
		Animal dog = new Animal("Fido", "Doge", "Spotted");
		System.out.println(dog.animalCount() + "\n");
		
		Dino raptor = new Dino("Blue", "Velociraptor", "blue", 0, true);
		System.out.println(raptor.animalCount());
		System.out.println(raptor.dinoCount() + "\n");
		
		Bird cardinal = new Bird("Fred", "Cardinal", "red", 0, false, false);
		System.out.println(cardinal.animalCount());
		System.out.println(cardinal.dinoCount());
		System.out.println(cardinal.birdCount() + "\n");
		
		Fish nemo = new Fish("Nemo", "Clownfish", "Orange", 4, 2);
		System.out.println(nemo.animalCount());
		System.out.println(cardinal.dinoCount());
		System.out.println(cardinal.birdCount());
		System.out.println(nemo.fishCount() + "\n");
		
		
		//System.out.println(dog);
		//System.out.println(raptor);
		//System.out.println(cardinal);
		
		//System.out.println(cardinal.getName());
		//System.out.println(cardinal.getHorns());
		
		//System.out.println(generateAnimal());
	}
}
