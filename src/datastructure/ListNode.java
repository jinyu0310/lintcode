package datastructure;

public class ListNode {
	public int val;
	public ListNode next;
	public ListNode(int x) {
		val = x;
		next = null;      
	}
	
//	public ListNode() {     
//	}
	
	
	public boolean hasNext() { 
	    return this.next != null; 
	} 
}
