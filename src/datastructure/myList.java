package datastructure;

public class myList {
    public ListNode head; 
    public ListNode tail;
    
    public myList() { 
        this.head = new ListNode(0); 
    }
    
    public myList(ListNode head) { 
        this.head = head; 
    }
    
    public myList(int val) { 
    	ListNode thead = new ListNode(val);
        this.head = thead; 
    } 
 
    public void add(int val) {
    	ListNode phead = this.head;
    	while(phead.hasNext()){
    		phead = phead.next;
    	}
        phead.next = new ListNode(val); 
        this.tail = phead.next;
    } 
}
