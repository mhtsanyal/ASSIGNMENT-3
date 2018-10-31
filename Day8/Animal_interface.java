interface Animal
{
	void speak();
	void eat();
}
class Dog implements Animal
{
	public void speak()
	{
		System.out.println("Dogs bark.");
	}
	public void eat()
	{
		System.out.println("Dogs want bones.");
	}
}
class Cat implements Animal
{
	public void speak()
	{
		System.out.println("Cats meow.");
	}
	public void eat()
	{
		System.out.println("Cats drink milk.");
	}
}
public class Animal_interface
{
	public static void main(String[] x)
	{
		Dog d = new Dog();
		Cat c = new Cat();
		d.speak();
		d.eat();
		c.speak();
		c.eat();
	}
}