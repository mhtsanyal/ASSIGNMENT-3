import java.util.*;
class Occurence{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string:");
		String first=sc.nextLine();
		System.out.println("enter the second string:");
		String second=sc.nextLine();
		boolean res=first.contains(second);
		System.out.println(res);
	}
}