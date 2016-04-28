package lintcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import datastructure.TreeNode;

public class BinaryTreeZigzagLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    /**
     * @param root: The root of binary tree.
     * @return: A list of lists of integer include 
     *          the zigzag level order traversal of its nodes' values 
     */
    public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
    	ArrayList res = new ArrayList();
    	if(root == null){
    		return res;
    	}
    	
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
    	
    	queue.offer(root);
    	int leveloddOreven = 1;
    	while(!queue.isEmpty()){
    		ArrayList<Integer> resEL = new ArrayList<Integer>();
    		int levelnum = queue.size();
    		
    		for(int i = 0; i < levelnum;i++){
    			TreeNode head = queue.poll();
    			resEL.add(head.val);
    			stack.push(head);
    		}
    		res.add(resEL);
    		
    		for(int i = 0; i < levelnum;i++){
    			TreeNode head = stack.pop();
    			if(leveloddOreven%2 == 1){
    				if(head.right != null){
    					queue.offer(head.right);
    				}
    				if(head.left != null){
    					queue.offer(head.left);
    				}
    			}else{
    				if(head.left != null){
    					queue.offer(head.left);
    				}
    				if(head.right != null){
    					queue.offer(head.right);
    				}
    			}
    		}
    		leveloddOreven++;
    	}
    	
		return res;
        // write your code here
    }
}
