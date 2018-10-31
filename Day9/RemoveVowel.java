import java.util.*;
class RemoveVowel{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
	String s=str.replaceAll("[aeiouAEIOU]","");
	System.out.println(s);	
	}
}