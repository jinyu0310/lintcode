package swordtooffer;

import datastructure.ListNode;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//�����ص㣬ͷ������
    public static ListNode ReverseList(ListNode head) {
    	ListNode dummy = new ListNode(0);
    	ListNode p = head;
    	ListNode q = p;
    	while(p != null){
			q = p.next;
			p.next = dummy.next;
			dummy.next = p;
    		p = q;
    	}
    	
		return dummy.next;
    }
}
