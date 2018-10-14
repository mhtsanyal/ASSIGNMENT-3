import java.util.Scanner;
class rectangle
{
	double length;
	double breadth;
	double area(){
		System.out.println("enter the value of length and breadth of rectangle:");
		Scanner sc=new Scanner(System.in);
		double length=sc.nextDouble();
	double breadth=sc.nextDouble();
		double areas=(length*breadth);
		return areas;
	}

	}

class area_r{
	
	public static void main(String args[]){
		rectangle obj=new rectangle();
		double b=obj.area();
		System.out.println("Area="+b);
	}
}