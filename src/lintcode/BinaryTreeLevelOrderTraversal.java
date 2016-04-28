package lintcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
import datastructure.TreeNode;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    /**
     * @param root: The root of binary tree.
     * @return: Level order a list of lists of integer
     */
    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
    	ArrayList res = new ArrayList();
    	if(root == null){
    		return res;
    	}
    	//Queue接口，LinkedList实现类
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
		//根节点入队
		queue.offer(root);
    	while(!queue.isEmpty()){
    		ArrayList<Integer> resEL = new ArrayList<Integer>();
    		//每层元素个数
    		int lenEL = queue.size();
    		for(int i = 0; i < lenEL;i++){
    			TreeNode head = queue.poll(); //改变了根结点，最好新建一个辅助结点
    			resEL.add(head.val);          //整体广度优先搜索的
    			if(head.left != null){
    				queue.offer(head.left);
    			}
    			if(head.right != null){
    				queue.offer(head.right);
    			}     			
    		}
    		res.add(resEL);
    	}
		return res;
        // write your code here
    }
    
    public List<List<Integer>> levelOrder1(TreeNode root) {
    	if(root == null){
    		return null;
    	}
    	
    	//Queue接口，LinkedList实现类
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
		//根节点入队
		queue.add(root);
    	while(root != null || queue != null){
    		ArrayList<Integer> resEL = new ArrayList<Integer>();
    		//每层元素个数
    		int lenEL = queue.size();
    		for(int i = 0; i < lenEL;i++){
    			root = queue.poll();
    			if(root != null){
        			resEL.add(root.val);
        			if(root.left != null){
        				queue.add(root.left);
        			}
        			if(root.right != null){
        				queue.add(root.right);
        			}     			
    			}
    		}
    		res.add(resEL);
    	}
		return res;
        // write your code here
    }
}
