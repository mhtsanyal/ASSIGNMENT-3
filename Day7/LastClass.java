final class Demo
{
	
}
class LastClass extends Demo
{
	public  void show()
	{
		System.out.println("This class cannot be extended further.");
	}
	public static void main(String args[])
	{
	
		LastClass obj = new LastClass();
		obj.show();
	}
}

