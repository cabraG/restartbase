package cabra.restart;

import java.util.Scanner;

public class b24ac {
	
	
	//��=b^2-4ac��ֵ,����С��0,һԪ���η����޸�.��������0,һԪ���η�����������ȵĸ�.��������0,һԪ���η�������������ȵ�ʵ����
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner s1=new Scanner(System.in);
		System.out.println("������2�η�ϵ��");
		 a=s1.nextInt();
		System.out.println("������1�η�ϵ��");
		b=s1.nextInt();
		System.out.println("����0�η���ϵ��");
		c=s1.nextInt();
		
		if((b*b-4*a*c)<0){
			System.out.println("��ʵ����");
			return;
		}
		
		double x1= (-b+Math.sqrt(b*b-4*a*c))/(2*a);
		double x2= (-b-Math.sqrt(b*b-4*a*c))/(2*a);
		System.out.println("x1="+x1+"x2="+x2);
	}
	

}
