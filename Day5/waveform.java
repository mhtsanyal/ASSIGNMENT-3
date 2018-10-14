import java.util.Scanner;
class waveform{
	public static void main(String args[]){
		int arr[];
		arr=new int[10];
		int temp;
		int temp2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of array:");
		for(int i=0;i<10;i++){
			arr[i]=sc.nextInt();
		}
		//for sorting
		for(int i=0;i<10;i++){
			for(int j=0;j<9-i;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<10;i=i+2){
			temp2=arr[i+1];
			arr[i+1]=arr[i];
			arr[i]=temp2;
		}
		for(int i=0;i<10;i++){
			System.out.print(arr[i]+" ");
		}
	}
}

