import java.util.Scanner;
class palindrome
{
public static void main(String args[])
{
int num,n,sum=0,rem;
Scanner sc= new Scanner(System.in);
System.out.println("enter the no.");
n=sc.nextInt();
num=n;
while(n>0)
{
rem=n%10;
sum=(sum*10)+rem;
n=n/10;
}
if(num==sum){
System.out.println(num +"= This no. is palindrome no.");
}
else
{
System.out.println(num + "= This is not a palindrome no.");
}
}
}