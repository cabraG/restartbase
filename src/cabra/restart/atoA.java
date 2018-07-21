package cabra.restart;

import java.util.Scanner;

public class atoA {
	
	//×ª»»Ð¡Ð´to´óÐ´
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		String sentence=s1.next();
		char arr[] = sentence.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			 if (arr[i]>=97&&arr[i]<=122){ 
				 arr[i]=(char)(arr[i]-32);
				
				 
			 }
		}
		System.out.println(new String(arr));
		
	}

}
