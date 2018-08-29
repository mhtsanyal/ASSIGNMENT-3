import java.util.Scanner;
class year
{
public static void main(String args[])
{
int n1,year=0;
Scanner sc= new Scanner(System.in);
System.out.println("enter the year ");
year=sc.nextInt();
if(year %4 ==0)
{
System.out.println(" THIS YEAR IS A LEAP YEAR");
year++;
}
else
{
System.out.println("THIS YEAR IS NOT A LEAP YEAR");
}
}
}