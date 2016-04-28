package lintcode;

import java.util.ArrayList;
import java.util.Stack;

import datastructure.TreeNode;

public class BinaryTreeInorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    /**
     * @param root: The root of binary tree.
     * @return: Inorder in ArrayList which contains node values.
     */
    public static ArrayList<Integer> inorderTraversal(TreeNode root) {
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	if(root == null){
    		return res;
    	}
    	
    	res.addAll(inorderTraversal(root.left));
    	res.add(root.val);
    	res.addAll(inorderTraversal(root.right));
    	
		return res;
        // write your code here
    }
    
    public static ArrayList<Integer> inorderTraversal2(TreeNode root) {
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	TreeNode pNode = root;
    	while(pNode != null || !stack.empty()){
    		while(pNode != null){
    			stack.push(pNode);
    			pNode = pNode.left;
    		}
    		pNode = stack.pop();
    		res.add(pNode.val);
    		pNode = pNode.right;
    	}
    	
		return res;
        // write your code here
    }
    
}
