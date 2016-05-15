package swordtooffer;

import datastructure.ListNode;

public class KthNodeOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static ListNode FindKthToTail(ListNode head,int k) {
    	ListNode pfirst = head;
    	while( k > 0 && pfirst != null ){
    		pfirst = pfirst.next;
    		k--;
    	}
    	//k大于链表长度
    	if( k > 0 ){
    		return null;
    	}
    	ListNode psecond = head;
    	while(pfirst != null){
    		pfirst = pfirst.next;
    		psecond = psecond.next;
    	}
    	
    	
		return psecond;

    }
}
