package lintcode;

import java.util.ArrayList;
import java.util.Stack;

import datastructure.TreeNode;

public class BinaryTreePostorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    /**
     * @param root: The root of binary tree.
     * @return: Postorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	if(root == null){
    		return res;
    	}
    	
    	res.addAll(postorderTraversal(root.left));
    	res.addAll(postorderTraversal(root.right));
    	res.add(root.val);
    	
		return res;
        // write your code here
    }
    
    public ArrayList<Integer> postorderTraversal2(TreeNode root) {
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	TreeNode pNode = root;
    	while(pNode != null && !stack.empty()){
    		while(pNode != null){
    			stack.push(pNode);
    			pNode = pNode.left;
    		}
    		pNode = stack.pop();
    		while(pNode != null){
    			stack.push(pNode);
    			pNode = pNode.right;
    		}
    		pNode = stack.pop();
    		res.add(pNode.val); //×ó½Úµã
    	}
    	
		return res;
        // write your code here
    }
}
