package cabra.restart;

public class Fibonacci {
	 public int Fibonacci(int n){
		 if(n<0){
			 return 0;
		 }
		 if(n<=2){
	 return 1;
	 }
	
		 return Fibonacci(n-1)+Fibonacci(n-2);
	 }

	 
	 public static void main(String[] args) {
		 Fibonacci f =new Fibonacci();
		 System.out.println(f.Fibonacci(6));
	}
}
