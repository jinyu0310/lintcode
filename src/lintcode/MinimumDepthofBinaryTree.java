package lintcode;

import java.util.LinkedList;

import datastructure.TreeNode;

public class MinimumDepthofBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
	//��������ʵ�ַǵݹ�ʵ������������������·�����Ȼ������⣡
	//Ӧ�����÷ǵݹ鷽��ʵ�����Ҹ�˳��ı���������·�����Ⱦͺ�ջ���һ�£�
    public static int minDepth(TreeNode root) {
    	if(root == null){
    		return 0;
    	}
    	int minmumlen = 0xFFFF;
    	int length = 0;//��ǰ·������
    	//ջ
    	LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
    	TreeNode head = root;
    	stack.push(head);
    	length++;
    	while(!stack.isEmpty()){
    		while( head.left != null){
    			head = head.left;
    			stack.push(head);
    			length++;
    		}
    		head = stack.pop(); //��Ȼ��ջ������·������Ҫ��һ0����ʱ��ڵ�Ϊnull
    		length--;
    		if( head.right == null){
    			//��ʱ�ҽ��Ϊnull��headΪҶ�ӽڵ㣬��ʱlength��Ϊ·������
        		if(length < minmumlen){
        			minmumlen = length;
        		}
    		}
    		while(head.right == null && !stack.isEmpty()){
    			head = stack.pop();
    			length--;
    		}
    		if(head.right != null){
//    			length++; //��һ���Ҳ��㣬���ȼ�һ
        		head = head.right;
            	stack.push(head);
            	length++;
    		}
    	}
    	
		return minmumlen;
        // write your code here
    }
}
