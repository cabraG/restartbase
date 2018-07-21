package cabra.restart;

import java.util.Scanner;

public class sort4num {
	public static void main(String[] args) {
		int num = 4;
		int arr[]=new int[num];
		Scanner s1=new Scanner(System.in);
		System.out.println("请输入四个数");
		for(int s=0;s<num;s++){
			arr[s]=s1.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
				
			}
		}
		for (int i : arr) {
			System.out.println(i);
			
		}
		
	}
	

}
