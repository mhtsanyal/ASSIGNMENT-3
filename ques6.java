import java.util.Scanner;
class prime
{
public static void main(String args[])
{
int i,n,c=0;
Scanner sc= new Scanner(System.in);
System.out.println("enter the no.");
n=sc.nextInt();
for(i=1;i <=n;i++)
{
if( n % i==0)
{
c++;
}
}
if(c == 2)
{
System.out.println("number is a prime no");
}
else
{
System.out.println("number is not prime");
}
}
}
