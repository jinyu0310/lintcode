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
    	
    	ListNode dummy = new ListNode(0); //�ƽ��
//    	dummy.next = new ListNode(head.val);// һ
//    	ListNode tail = dummy.next;
    	//ListNode tail = new ListNode(head.val); // ��
    	//tail = dummy.next; //������ǰ�dummy.nextָ��tail��
    	
    	ListNode tail = new ListNode(head.val);  // �� 
    	dummy.next = tail; //������ǰ�dummy.nextָ��tail����һ�ȼ�
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
    	
    	ListNode dummy = new ListNode(0); //�ƽ��
    	dummy.next = head; //������ǰ�dummy.nextָ��tail����һ�ȼ�
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
