import java.util.Scanner;
class second_l{
	public static void main(String args[]){
		int max=-1111;
		int max1=-1111;
		int arr[];
		 arr=new int[10];
		Scanner sc =new Scanner(System.in);
		System.out.println("enter 10 values:");
		for(int i=0;i<10;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		for(int i=0;i<10;i++){
			if(arr[i]>max1&&arr[i]<max){
				max1=arr[i];
			}
		}
		System.out.println("second largest element:"+max1);
	}
}