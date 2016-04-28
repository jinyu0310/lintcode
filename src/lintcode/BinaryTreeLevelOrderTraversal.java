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
    	//Queue�ӿڣ�LinkedListʵ����
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
		//���ڵ����
		queue.offer(root);
    	while(!queue.isEmpty()){
    		ArrayList<Integer> resEL = new ArrayList<Integer>();
    		//ÿ��Ԫ�ظ���
    		int lenEL = queue.size();
    		for(int i = 0; i < lenEL;i++){
    			TreeNode head = queue.poll(); //�ı��˸���㣬����½�һ���������
    			resEL.add(head.val);          //����������������
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
    	
    	//Queue�ӿڣ�LinkedListʵ����
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
		//���ڵ����
		queue.add(root);
    	while(root != null || queue != null){
    		ArrayList<Integer> resEL = new ArrayList<Integer>();
    		//ÿ��Ԫ�ظ���
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
