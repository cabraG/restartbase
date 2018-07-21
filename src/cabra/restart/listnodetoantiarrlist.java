package cabra.restart;

import java.util.ArrayList;
import java.util.Stack;



public class listnodetoantiarrlist {
	
	
	public static void main(String[] args) {
		
	}
	
	
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		Stack<Integer> stack=new Stack<Integer>();
		while(listNode.next!=null){
			stack.push(listNode.val);
			 listNode = listNode.next;
			
		}
		ArrayList<Integer> arrlist=new ArrayList<Integer>();
		while(stack.isEmpty()){
			arrlist.add(stack.pop());
			
		}
		
		
		return arrlist;
	
	}

	
	
}

 class ListNode {
        int val;
       ListNode next = null;

       ListNode(int val) {
           this.val = val;
       }
   }
