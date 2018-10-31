class Animal
{
	String breed="Pitbull";
	String color="Black";
	public void speak()
	{
		System.out.println("Animal Breed:"+breed);
		System.out.println("Animal Color:"+color);	
	}
}
class Dog extends Animal
{
	public void speak()
	{
		System.out.println("Bark");
	}
}
class Cat extends Animal
{
	public void speak()
	{
		System.out.println("Meow");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Animal obj=new Animal();
		obj.speak();
		obj=new Dog();
		obj.speak();
		obj=new Cat();
		obj.speak();
		
		

	}

}