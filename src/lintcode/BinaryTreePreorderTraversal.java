package lintcode;

import java.util.ArrayList;
import java.util.LinkedList;

import datastructure.TreeNode;

public class BinaryTreePreorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    /**
     * @param root: The root of binary tree.
     * @return: Preorder in ArrayList which contains node values.
     */
    public static ArrayList<Integer> preorderTraversalRecursive(TreeNode root) {
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	
    	if(root == null){
    		return res;
    	}
    	
    	res.add(root.val);
    	res.addAll(preorderTraversalRecursive(root.left));
    	res.addAll(preorderTraversalRecursive(root.right));
    	
		return res;
        // write your code here
    }
    
    /**
     * @param root: The root of binary tree.
     * @return: Preorder in ArrayList which contains node values.
     */
    public static ArrayList<Integer> preorderTraversalStack(TreeNode root) {
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	
    	if(root == null){
    		return res;
    	}
    	
    	LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
    	stack.push(root);
    	while(!stack.isEmpty()){
    		TreeNode head = stack.pop();
    		res.add(head.val);
    		if(head.right != null){
    			stack.push(head.right);
    		}
    		if(head.left != null){
    			stack.push(head.left);
    		}
    	}
    	
		return res;
        // write your code here
    }
}
