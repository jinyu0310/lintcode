package datastructure;

public class ListNode {
	public int val;
	public ListNode next;
	ListNode(int x) {
		val = x;
		next = null;      
	}
	
	
	public boolean hasNext() { 
	    return this.next != null; 
	} 
}
