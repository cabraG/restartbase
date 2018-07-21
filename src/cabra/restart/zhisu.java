package cabra.restart;

import java.util.Scanner;

public class zhisu {
	
	
	
	public static int getzhisu(int n){
		int cont=0;
		int i,j;
		for(i=2;i<n;i++){
			for(j=2;j<i;j++){
				if(i%j==0){
					break;
				}
				
			} 
			if(i==j){
				cont++;
			}
		}
		return cont;
	}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println(getzhisu(a));
}
}
