package cabra.restart;

import java.util.ArrayList;
import java.util.Arrays;

public class bteasyso {
	
	
	public static void main(String[] args) {
		int[] pre={1,2,4,7,3,5,6,8};
		int[] in={4,7,2,1,5,3,8,6};
		
		bteasyso b=new bteasyso();
		
		TreeNode n =b.reConstructBinaryTree(pre,in);
		

		n.InOrder(n);
		System.out.println();
		n.PreOrder(n);
		System.out.println();
		n.PostOrder(n);
		System.out.println();
for (int i : n.OnOrder(n)) {
			
			System.out.print(i);
			
		}
		/*System.out.println(n.left.left.right.val);*/
		b.Mirror(n);
		System.out.println();
		n.InOrder(n);
		System.out.println();
		n.PreOrder(n);
		System.out.println();
		n.PostOrder(n);
		System.out.println();
		
		
		
	}
	
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		   if(pre==null||in==null){
		        return null;
		    }
		    
	    int len = pre.length;
	    if (len == 0) {
            return null;
        }
	    
	    int val = pre[0];
	   
		
		TreeNode head =new TreeNode(val);
		int gen=0;
		for(int i=0;i<in.length;i++){
			if(in[i]==pre[0]){
				gen=i;
				break;
				
			}
		}
		
		int[] left_pre = new int[gen],right_pre = new int[in.length-gen-1],left_in = new int[gen],right_in = new int[in.length-gen-1];
		
		/*for(int i=0;i<gen;i++){
			left_pre[i]=pre[i+1];
		    left_in[i]=in[i];
		}*/
	
		/*for(int i=gen+1;i<in.length;i++)
			 
        {
			int x=0;
			right_pre[x]=pre[i];
			right_in[x]=in[i];
			x++;
        }*/
		
		System.arraycopy(pre,1,left_pre,0,gen);
		System.arraycopy(in,0,left_in,0,gen);
		
		System.arraycopy(pre,gen+1,right_pre,0,in.length-gen-1);
		System.arraycopy(in,gen+1,right_in,0,in.length-gen-1);
		
		
		head.left=reConstructBinaryTree(left_pre,left_in);
		head.right=reConstructBinaryTree(right_pre,right_in);
		
		
	    return head;
	    
	
	}
	
    
    public void Mirror(TreeNode root) {
    	
    	
           if(root!=null){
        	   
        	   TreeNode temp=null;
        	   
        	   if(root.left!=null||root.right!=null){
        		   temp=root.left;
        		   root.left=root.right;
        		   root.right=temp;
        	   }
        	   Mirror(root.left);
        	   Mirror(root.right);
        	  
        	   
        }
           else return;
           
        
        
    }
	
	
	class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	      
	      
	      public void InOrder(TreeNode node) {
	    	           if (node != null) {
	    	              InOrder(node.left);
	    	              System.out.print(node.val);
	    	             InOrder(node.right);
	    	          }
	    	      }
	      
	      public void PreOrder(TreeNode node) {
	    	           if (node != null) {
	    	               System.out.print(node.val);
	    	               PreOrder(node.left);
	    	               PreOrder(node.right);
	    	           }
	    	       }
	      
	      
	      public void PostOrder(TreeNode node) {
	    	           if (node != null) {
	    	               PostOrder(node.left);
	    	               PostOrder(node.right);
	    	               System.out.print(node.val);
	    	           }
	    	       }
	      
	      public ArrayList<Integer> OnOrder(TreeNode node){
	    	  ArrayList<Integer> list=new ArrayList<Integer>();
	    	  if (node == null) {
	    		  return null;
	    	  }
	    	  ArrayList<TreeNode> temp=new ArrayList<TreeNode>();
	    	  temp.add(node);
	    	  while(!temp.isEmpty()){
	    		  
	    		 
	    		  TreeNode n=temp.remove(0);
	    		
	    		 
	    		  if(n.left!=null) temp.add(n.left);
	    		  if(n.right!=null) temp.add(n.right);
                    list.add(n.val);
	    		  
	    	  }
	    	  System.out.println();
	    	  return list;
	    	  
	      }
	     
	    
	  }
	 
}
