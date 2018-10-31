abstract class Animals
{
    String color, breed, name;
	abstract void eat();
	void speak()
	{
		System.out.println("Speak");
	}
}
class Dog extends Animals
{
	public void eat()
	{
		System.out.println("Dogs eat bones");
	}
}
class Cat extends Animals
{
	public void eat()
	{
		System.out.println("Cats drink milk");
	}
}
public class Animal_abstract
{
	public static void main(String[] x)
	{
		Dog d = new Dog();
		Cat c = new Cat();
		d.color = "Brown";
		d.breed = "Golden Retriever";
		d.name = "Joey";
	    System.out.println("Name : " + d.name + " Breed: " + d.breed + " Color: " + d.color);
		d.eat();
		c.color = "White";
		c.breed = "Persian cat";
		c.name = "Snowbell";
		System.out.println("Name: " + c.name + " Breed: " + c.breed + " Color: " + c.color);
		c.eat();
	}
}