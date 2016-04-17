package datastructure;

public class ListNodeT<T> {
	public T val;
	public ListNodeT<T> next;
	public ListNodeT(T x) {
		val = x; 
	}
	public boolean hasNext() { 
	    return this.next != null; 
	} 
}
