import java.util.Scanner;
class biggest
{
public static void main(String args[])
{
int a,b,c,biggest;
Scanner sc = new Scanner(System.in);
System.out.println("enter 1st number: ");
a=sc.nextInt();
System.out.println("enter 2st number: ");
b=sc.nextInt();
System.out.println("enter 3rd number: ");
c=sc.nextInt();
if(a > b && a > c)
{
System.out.println("A is the largest no. i.e= " +a);
}
else if( b >c)
{
System.out.println("B is the largest no. i.e= " +b);
}
else
{
System.out.println("C is the largest no. i.e= " +c);
}
}
}