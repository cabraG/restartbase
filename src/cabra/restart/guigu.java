package cabra.restart;

import java.util.Random;

public class guigu {
	 public static void main(String[] args) {
	        /*
	         * 验证“鬼谷猜想”：对任意自然数，若是奇数，
	         * 就对它乘以3再加1；若是 偶数，就对它除以2，
	         * 这样得到一个新数，
	         * 再按上述计算规则进行计算，
	         * 一直进 行下去，最终必然得到1。 */
	        int num;
	        Random rd=new Random();
	        //Integer.MAX_VALUE为最大的整数
	        num=1+rd.nextInt(Integer.MAX_VALUE);//产生数的范围-2[31]----2[31]-1
	        //System.err.println(rd.nextInt(100));//产生数>=0且<100
	        System.out.println("原本的数为"+num);
	        while(num!=1){
	            System.out.println("产生的新数是"+num);
	            if(num%2==0){
	                //偶数
	                num=num/2;
	            }
	            else{
	                num=num*3+1;
	            }
	        }
	        System.out.println(num);
	    }

}
