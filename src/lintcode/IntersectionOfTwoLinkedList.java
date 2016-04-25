package lintcode;

import java.util.Stack;

import datastructure.ListNode;

public class IntersectionOfTwoLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    /**
     * @param headA: the first list
     * @param headB: the second list
     * @return: a ListNode 
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	if(headA == null || headB == null){
    		return null;
    	}
    	Stack<Integer> stacka = new Stack<Integer>();
    	Stack<Integer> stackb = new Stack<Integer>();

    	ListNode pA = headA, pB = headB;
    	while(pA != null){
    		stacka.push(pA.val);
    		pA = pA.next;
    	}
    	while(pB != null){
    		stackb.push(pB.val);
    		pB = pB.next;
    	}
    	int flag = 0;
    	while(!stacka.empty() && !stackb.empty()){
    		if(stacka.pop() != stackb.pop()){
    			flag = 1;
    			break;
    		}
    	}
    	int reserve = stacka.size() ;
    	while(reserve > 0){
    		headA = headA.next;
    		reserve--;
    		
    	}
		if(flag == 1){
			return headA.next;
		}else{
			return headA;
		}
        // Write your code here
    } 
}
