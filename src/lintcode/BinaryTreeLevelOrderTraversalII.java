package lintcode;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    /**
     * @param root: The root of binary tree.
     * @return: buttom-up level order a list of lists of integer
     */
    public static ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
    	ArrayList res = new ArrayList();
    	if(root == null){
    		return res;
    	}
    	
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	LinkedList<Integer> stack = new LinkedList<Integer>();
    	ArrayList<Integer> levelnum = new ArrayList<Integer>();
    	
    	queue.offer(root);
    	while(!queue.isEmpty()){
    		int levelsize = queue.size();
    		levelnum.add(levelsize);
    		for(int i = 0; i < levelsize; i++){
    			TreeNode head = queue.poll();
    			stack.push(head.val);
    			if(head.right != null){
    				queue.offer(head.right);
    			}
    			if(head.left != null){
    				queue.offer(head.left);
    			}
    		}
    	}
    	
    	for(int i = levelnum.size()-1; i >= 0 ;i--){
    		ArrayList<Integer> resEL = new ArrayList<Integer>();
    		for(int j = 0; j < levelnum.get(i); j++){
    			resEL.add(stack.pop());
    		}
    		res.add(resEL);
    	}
    	
		return res;
        // write your code here
    }
}
