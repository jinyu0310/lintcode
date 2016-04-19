package lintcode;

import datastructure.ListNode;

public class DeleteMiddleNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    /**
     * @param node: the node in the list should be deleted
     * @return: nothing
     */
    public void deleteNode(ListNode node) {
        // write your code here
    	if(node.next == null){
    		return;
    	}
    	node.val = node.next.val;
    	node.next = node.next.next;
    }
}
