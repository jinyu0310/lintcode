package lintcode;

import datastructure.ListNode;

public class InsertionSortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    /**
     * @param head: The first node of linked list.
     * @return: The head of linked list.
     */
    public static ListNode insertionSortList(ListNode head) {
    	if(head == null){
    		return head;
    	}
    	ListNode find = head; //外循环插入指针 find.next位待排序节点
    	while(find.next != null){
    		ListNode point = new ListNode(-1); //内循环寻找插入位置指针
    		point.next = head;  //point.next为截止位置
    		//待排序元素最小，插在头指针位置
    		if(head.val > find.next.val){
        		ListNode p = find.next; //取出待插入节点
        		find.next = find.next.next; //待插入位置处调整
        		p.next = point.next; //插入处调整
        		head = p; //修改头指针指向 
    		}else{
    			//判断是否插在最后
    			if(find.val <= find.next.val){
    				find = find.next; //有序排列，不用动，find指针后移一位
    			}else{
    				//找到正确的插入位置
            		while(point.next.val <= find.next.val){ //小于，不稳定，小于等于应该是稳定的
            			point = point.next;
            		}
            		ListNode p = find.next; //取出待插入节点
            		find.next = find.next.next; //待插入位置处调整
            		p.next = point.next; //插入处调整
            		point.next = p; 
    			}
    		}
    	}
		return head;
        // write your code here
    }

}
