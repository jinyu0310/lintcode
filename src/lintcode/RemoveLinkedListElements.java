package lintcode;

import datastructure.ListNodeT;

public class RemoveLinkedListElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static <T> ListNodeT<T> removeElements(ListNodeT<T> head, T val) {
    	if(head == null){
    		return head;
    	}
    	ListNodeT<T> dummy = new ListNodeT<T>(null);
    	ListNodeT<T> p = dummy;
    	p.next = head; //p—∆Ω·µ„
    	ListNodeT<T> q = head;
    	while(q != null){
    		if(q.val == val){
    			p.next = q.next;
    			q = q.next;
    		}else{
        		q = q.next;
        		p = p.next;
    		}
    	}
    	
		return dummy.next;
        // Write your code here
    }
}
