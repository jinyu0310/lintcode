package lintcode;

import datastructure.ListNode;

public class RemoveDuplicateFromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    /**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of linked list
     */
    public static ListNode deleteDuplicates(ListNode head) {
        // write your code here
    	if(head == null){
    		return head;
    	}
    	
    	ListNode dummy = new ListNode(0); //哑结点
//    	dummy.next = new ListNode(head.val);// 一
//    	ListNode tail = dummy.next;
    	//ListNode tail = new ListNode(head.val); // 二
    	//tail = dummy.next; //这个不是把dummy.next指向tail；
    	
    	ListNode tail = new ListNode(head.val);  // 三 
    	dummy.next = tail; //这个才是把dummy.next指向tail；与一等价
    	while(head != null){
    		if(tail.val < head.val){
    			tail.next = new ListNode(head.val);
    			tail = tail.next;
    		}
    		head = head.next;
    	}
    	
		return dummy.next; 

    } 
    
    public static ListNode deleteDuplicates2(ListNode head) {
        // write your code here
    	if(head == null){
    		return head;
    	}
    	
    	ListNode dummy = new ListNode(0); //哑结点
    	dummy.next = head; //这个才是把dummy.next指向tail；与一等价
    	ListNode tail = head;
    	while(head != null){
    		if(tail.val < head.val){
    			tail.next = head;
    			tail = tail.next;
    		}
    		head = head.next;
    	}
    	tail.next = null;
		return dummy.next; 

    } 
    
}
