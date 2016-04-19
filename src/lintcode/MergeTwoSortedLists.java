package lintcode;

import datastructure.ListNode;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    /**
     * @param ListNode l1 is the head of the linked list
     * @param ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
	//���������������ϲ�������������
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	if(l1 == null && l2 == null){
    		return null;
    	}
    	ListNode dummy = new ListNode(0); //��������׽��
    	ListNode tail = dummy.next; //β�ڵ�
    	//�������׽ڵ㶼��Ϊnull
    	while(l1 != null && l2 != null){
    		ListNode pListNode = dummy;
    		ListNode qListNode = new ListNode(0);
    		if(l1.val < l2.val){
    			qListNode = l1;
    			l1 = l1.next;
    		}else{
    			qListNode = l2;
    			l2 = l2.next;
    		}
    		while(pListNode.next != null && pListNode.next.val < qListNode.val){
    			pListNode = pListNode.next;
    		}
    		qListNode.next = pListNode.next;
    		pListNode.next = qListNode;
    	}
    	while(l1 != null){
    		ListNode pListNode = dummy;
    		ListNode temp = l1;
    		l1 = l1.next;
    		while(pListNode.next != null && pListNode.next.val < temp.val){
    			pListNode = pListNode.next;
    		}
    		temp.next = pListNode.next;
    		pListNode.next = temp;
    	}
    	while(l2 != null){
    		ListNode pListNode = dummy;
    		ListNode temp = l2;
    		l2 = l2.next;
    		while(pListNode.next != null && pListNode.next.val < temp.val){
    			pListNode = pListNode.next;
    		}
    		temp.next = pListNode.next;
    		pListNode.next = temp;
    	}
    	
		return dummy.next;
        // write your code here
    }
    
    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
    	if(l1 == null && l2 == null){
    		return null;
    	}
    	ListNode dummy = new ListNode(0); //��������׽��
    	ListNode tail = dummy; //β�ڵ�
    	//�������׽ڵ㶼��Ϊnull
    	while(l1 != null && l2 != null){
    		ListNode qListNode = new ListNode(0); //���Ҳ����Ҫ��ÿ�ζ���������ܺ�ʱ��
    		if(l1.val < l2.val){
    			qListNode = l1;
    			l1 = l1.next;
    		}else{
    			qListNode = l2;
    			l2 = l2.next;
    		}
    		qListNode.next = tail.next; //���������Ҫ��tail�Ѿ���β�ڵ���
    		tail.next = qListNode;
    		tail = tail.next;
    	}
    	while(l1 != null){
    		ListNode temp = l1;
    		l1 = l1.next;
    		temp.next = tail.next;
    		tail.next = temp;
    		tail = tail.next;
    	}
    	while(l2 != null){
    		ListNode temp = l2;
    		l2 = l2.next;
    		temp.next = tail.next;
    		tail.next = temp;
    		tail = tail.next;
    	}
    	
		return dummy.next;
        // write your code here
    }

    public static ListNode mergeTwoLists3(ListNode l1, ListNode l2) {
    	if(l1 == null && l2 == null){
    		return null;
    	}
    	ListNode dummy = new ListNode(0); //��������׽��
    	ListNode tail = dummy; //β�ڵ�
    	//�������׽ڵ㶼��Ϊnull
    	while(l1 != null && l2 != null){
    		if(l1.val < l2.val){
    			tail.next = l1;
    			l1 = l1.next;
    		}else{
    			tail.next = l2;
    			l2 = l2.next;
    		}
    		tail = tail.next;
    	}
    	if(l1 != null){
    		tail.next = l1;
    	}else{
    		tail.next = l2;
    	}
		return dummy.next;
        // write your code here
    }
    
}
