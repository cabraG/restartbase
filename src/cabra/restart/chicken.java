package cabra.restart;

public class chicken {
	  public static void main(String[] args) {
	        /* 、编写程序解决“百钱买百鸡”问题。
	         * 公鸡五钱一只，母鸡三钱一只，
	         * 小鸡 一钱三只，
	         * 现有百钱欲买百鸡，共有多少种买法？ */
	        for(int g=0;g<=20;g++){
	            for(int m=0;m<=33;m++){
	                for(int x=0;x<=100-g-m;x++){
	                    if(x % 3==0 && 5*g+m*3+x/3 == 100 && g+m+x ==100){
	                        System.out.println("公鸡"+g+"只母鸡"+m+"只小鸡"+x+"只");
	                    }
	                }
	            }
	        }
	    }

}
