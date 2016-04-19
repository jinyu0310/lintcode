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
	//这个程序可以用来合并两个无序链表！
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	if(l1 == null && l2 == null){
    		return null;
    	}
    	ListNode dummy = new ListNode(0); //新链表的首结点
    	ListNode tail = dummy.next; //尾节点
    	//两链表首节点都不为null
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
    	ListNode dummy = new ListNode(0); //新链表的首结点
    	ListNode tail = dummy; //尾节点
    	//两链表首节点都不为null
    	while(l1 != null && l2 != null){
    		ListNode qListNode = new ListNode(0); //这个也不需要，每次都创建对象很耗时的
    		if(l1.val < l2.val){
    			qListNode = l1;
    			l1 = l1.next;
    		}else{
    			qListNode = l2;
    			l2 = l2.next;
    		}
    		qListNode.next = tail.next; //这根本不需要，tail已经是尾节点了
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
    	ListNode dummy = new ListNode(0); //新链表的首结点
    	ListNode tail = dummy; //尾节点
    	//两链表首节点都不为null
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
