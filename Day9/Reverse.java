import java.util.*;
class Reverse{
	public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String str=sc.nextLine();
StringBuilder rev=new StringBuilder();
rev.append(str);
rev=rev.reverse();
System.out.println(rev);
	}
}