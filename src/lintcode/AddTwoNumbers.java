package lintcode;

import datastructure.ListNode;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    /**
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2 
     */
    public static ListNode addLists(ListNode l1, ListNode l2) {
    	if(l1 == null && l2 == null){
    		return null;
    	}
    	if(l1 == null){
    		return l2;
    	}
    	if(l2 == null){
    		return l1;
    	}
    	int flagC = 0;
    	ListNode result = new ListNode(-1);
    	ListNode dummy = result;
    	while(l1 != null && l2 != null){
    		int sum = l1.val + l2.val + flagC;
    		result.next = new ListNode(sum%10);
    		flagC = (sum)/10;
    		l1 = l1.next;
    		l2 = l2.next;
    		result = result.next;
    	}
    	while(l1 != null){
    		int sum = l1.val + flagC;
    		result.next = new ListNode(sum%10);
    		flagC = (sum)/10;
    		l1 = l1.next;
    		result = result.next;
    	}
    	while(l2 != null){
    		int sum = l2.val + flagC;
    		result.next = new ListNode(sum%10);
    		flagC = (sum)/10;
    		l2 = l2.next;
    		result = result.next;
    	}
    	if(flagC != 0){
    		result.next = new ListNode(flagC);
    	}
		return dummy.next;
        // write your code here
    }
}
