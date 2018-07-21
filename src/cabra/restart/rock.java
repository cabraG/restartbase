package cabra.restart;

import java.util.Scanner;

public class rock {
public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
       while(scanner.hasNext())
       {
           String input = scanner.next();
           String[] A = input.split(",");
           int n = A.length;
           if(n <= 1)
           {
               System.out.println(input + ",0");
           }else{
               int[] arr = new int[n];
               int sum = 0;
               for(int i = 0; i < n ; i++)
               {
                   arr[i] = Integer.valueOf(A[i]);
                   sum += arr[i];
               }
               int half = sum / 2;
               int[] dp = new int[half + 1];
              
               int max = Integer.MIN_VALUE;
               for(int i = 0; i < n ; i++)
               {
                   for(int j = half ; j >= arr[i] ; j--)
                   {
                       dp[j] = dp[j - arr[i]] + arr[i];
                       max = Math.max(max , dp[j]);
                   }
               }
               System.out.println(sum - max + ","+ max);
               }
       }
}
class $computer{}
}
