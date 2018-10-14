import java.util.Scanner;
class complex{
	int real;
	int imaginary;
	void display(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of real and imaginary:");
	int real=sc.nextInt();
	int imaginary=sc.nextInt();
		System.out.println(real+"+"+imaginary+"i");
	}
}
class complex_o{
	public static void main(String args[]){
	complex obj=new complex();
	obj.display();
	}	
}