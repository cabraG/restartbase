package cabra.restart;

import java.util.Scanner;

public class b24ac {
	
	
	//△=b^2-4ac的值,若△小于0,一元二次方程无根.若△等于0,一元二次方程有两个相等的根.若△大于0,一元二次方程有两个不相等的实数根
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner s1=new Scanner(System.in);
		System.out.println("请输入2次方系数");
		 a=s1.nextInt();
		System.out.println("请输入1次方系数");
		b=s1.nextInt();
		System.out.println("输入0次方的系数");
		c=s1.nextInt();
		
		if((b*b-4*a*c)<0){
			System.out.println("无实数解");
			return;
		}
		
		double x1= (-b+Math.sqrt(b*b-4*a*c))/(2*a);
		double x2= (-b-Math.sqrt(b*b-4*a*c))/(2*a);
		System.out.println("x1="+x1+"x2="+x2);
	}
	

}
