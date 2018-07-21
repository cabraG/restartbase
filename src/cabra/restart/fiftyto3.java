package cabra.restart;

import java.util.Arrays;

public class fiftyto3 {
	
	

	public static void main(String[] args) {
		
		int arr[] = new int[50];
		int num=1;
		for(int i=0;i<50;i++){
			arr[i]=num++;
		}
		int[] get=getarr(arr);
		for (int i : get) {
			System.out.println(i);
			
		}
		System.out.println("we get"+get[2]);
		
		
	}
	
	public static int[] delete(int index,int array[]){
        //根据删除索引，把数组后面的向前移一位
	   int[] arrto=null;
        for(int i=index;i<array.length-1;i++){
            array[i] = array[i+1];
        }
        return Arrays.copyOf(array, array.length-1);
    }
	
	public static int[] getarr(int[] arr){
		int temp=0;
		
		if(arr.length==3)
			return arr;
		for(int i=0;i<arr.length;i++){
			temp++;
			if(temp==3){
				arr=delete(i,arr);
				temp=1;
				
			}
		}
		return getarr(arr);
		
	
	}
	
	
	
}
