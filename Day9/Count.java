import java.util.*;
class Count{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sentence");
		String str=sc.nextLine();
		int count=1;
		int len=str.length();
		for(int i=0;i<len-1;i++){
			if(str.charAt(i)==' '&&str.charAt(i+1)!=' '){
				count++;
			}
		}
		System.out.println("Total words in string:"+count);
	}
}