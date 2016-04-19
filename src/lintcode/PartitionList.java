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
    	ListNode lesstail = less.next; //���ʹ��������Ҫ���ˣ��� 
    	//β�ڵ�ʱdummy����һ���ڵ��dummy������ʲô����
    	ListNode bigtail = bigger.next;
    	while(head != null){
    		if(head.val < x){
    			if(lesstail == null){
    				lesstail = head;//lesstailָ����head������less��Ȼָ�����null��֮���׽ڵ����Ҳ�Ҳ������ˣ���
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
    
    //������Ľ���ύ֮���ǶԵģ�
    public static ListNode partition2(ListNode head, int x) {
    	if(head == null){
    		return null;
    	}
    	ListNode less = new ListNode(0);
    	ListNode bigger = new ListNode(0);
    	ListNode lesstail = less;//β�ڵ�
    	ListNode bigtail = bigger;
    	while(head != null){
    		if(head.val < x){  //��������иı���head�ڵ��ָ�򣿣�
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
