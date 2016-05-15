package swordtooffer;

import datastructure.ListNode;

public class MergeSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public static ListNode Merge(ListNode list1,ListNode list2) {
    	ListNode mergeListNode = new ListNode(0);
    	ListNode p = mergeListNode;
    	while(list1 != null && list2 != null){
    		if(list1.val < list2.val){
    			p.next = list1;
    			p = p.next;
    			list1 = list1.next;
    		}else{
    			p.next = list2;
    			p = p.next;
    			list2 = list2.next;
    		}
    	}
    	if(list1 != null){
    		p.next = list1;
    	}
    	if(list2 != null){
    		p.next = list2;
    	}
		return mergeListNode.next;
    }
}
