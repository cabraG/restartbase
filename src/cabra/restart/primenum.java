package cabra.restart;

public class primenum {
	public static void main(String[] args) {
        int num=200;
        while (num<=500) {
            boolean tag=true;       //素数标记
            for(int d=2;d<=num-1;d++){
                if(num % d==0){
                    tag=false;
                    break;
                }
            }
            if(tag){                //如果是素数
                System.out.println(num);
            }
            num++;
        }
    }

}
