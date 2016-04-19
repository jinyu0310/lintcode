package lintcode;

import datastructure.ListNode;

public class PartitionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    /**
     * @param head: The first node of linked list.
     * @param x: an integer
     * @return: a ListNode 
     */
    public static ListNode partition(ListNode head, int x) {
    	if(head == null){
    		return null;
    	}
    	ListNode less = new ListNode(0);
    	ListNode bigger = new ListNode(0);
    	ListNode lesstail = less.next; //典型错误，这个不要改了！！ 
    	//尾节点时dummy的下一个节点和dummy本身有什么区别。
    	ListNode bigtail = bigger.next;
    	while(head != null){
    		if(head.val < x){
    			if(lesstail == null){
    				lesstail = head;//lesstail指向了head，但是less依然指向的是null，之后首节点就再也找不回来了！！
    			}else{
    				lesstail.next = head;
    			}
    			lesstail = lesstail.next;
    		}else{
    			if(bigtail == null){
    				bigtail = head;
    			}else{
    				bigtail.next = head;
    			}
    			bigtail = bigtail.next;
    		}
			head = head.next;
    	}
    	lesstail.next = bigger.next;
    	
		return less;
        // write your code here
    }
    
    //这他妈的结果提交之后是对的，
    public static ListNode partition2(ListNode head, int x) {
    	if(head == null){
    		return null;
    	}
    	ListNode less = new ListNode(0);
    	ListNode bigger = new ListNode(0);
    	ListNode lesstail = less;//尾节点
    	ListNode bigtail = bigger;
    	while(head != null){
    		if(head.val < x){  //这个处理中改变了head节点的指向？？
    			lesstail.next = head;
    			lesstail = lesstail.next;
    		}else{
    			bigtail.next = head;
    			bigtail = bigtail.next;
    		}
			head = head.next;
    	}
    	bigtail.next = null;
    	lesstail.next = bigger.next;
    	
		return less.next;
        // write your code here
    }
}
