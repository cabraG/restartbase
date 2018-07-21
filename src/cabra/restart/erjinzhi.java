package cabra.restart;

public class erjinzhi {
	
	
	  public int NumberOf1(int n) {
	        int t=0;
	            char[]ch=Integer.toBinaryString(n).toCharArray();
	            for(int i=0;i<ch.length;i++){
	                if(ch[i]=='1'){
	                    t++;
	                }
	            }
	           for (char c : ch) {
	        	   System.out.println(c);
				
			}
	           String s=new String(ch);
	           System.out.println(s);
	            return t;
	    }
	  
	  public static void main(String[] args) {
		erjinzhi e=new erjinzhi();
		e.NumberOf1(10);
	}

}
