package cabra.restart;

import java.util.Scanner;

public class rebmun {
	static int cont=0;
	
	public static void rebmun(int i){
		 
		
		if(i<0){
			System.out.print("-");
			i=-i;
			
			
			
		}
		
		
		 
		if(i==0){
			return;
		}
			
		if(cont!=0||i%10!=0){
	        
	            System.out.print(i%10);
		}
		if((i/10)%10!=0){
		cont++;
		}
		
		rebmun(i/10);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=010;
	System.out.println(b);
	rebmun(a);
	
	
	}
}
