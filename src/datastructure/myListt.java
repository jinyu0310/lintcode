package datastructure;

public class myListt<T> {
    public ListNodeT<T> head; 
    
    public myListt() { 
        this.head = new ListNodeT<T>(null); 
    }
    
    public myListt(ListNodeT<T> head) { 
        this.head = head; 
    }
    
    public myListt(T val) { 
    	ListNodeT<T> thead = new ListNodeT<T>(val);
        this.head = thead; 
    } 
 
    public void add(T val) {
    	ListNodeT<T> phead = this.head;
    	while(phead.hasNext()){
    		phead = phead.next;
    	}
        phead.next = new ListNodeT<T>(val); 
    } 
}
