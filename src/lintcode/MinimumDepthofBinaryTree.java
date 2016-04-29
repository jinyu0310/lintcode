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
	//可以用来实现非递归实现中序遍历，但是输出路径长度还有问题！
	//应该是用非递归方法实现左右根顺序的遍历，那样路径长度就和栈深度一致！
    public static int minDepth(TreeNode root) {
    	if(root == null){
    		return 0;
    	}
    	int minmumlen = 0xFFFF;
    	int length = 0;//当前路径长度
    	//栈
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
    		head = stack.pop(); //虽然出栈，但是路径长度要加一0，此时左节点为null
    		length--;
    		if( head.right == null){
    			//此时右结点为null，head为叶子节点，此时length即为路径长度
        		if(length < minmumlen){
        			minmumlen = length;
        		}
    		}
    		while(head.right == null && !stack.isEmpty()){
    			head = stack.pop();
    			length--;
    		}
    		if(head.right != null){
//    			length++; //有一个右岔结点，长度加一
        		head = head.right;
            	stack.push(head);
            	length++;
    		}
    	}
    	
		return minmumlen;
        // write your code here
    }
}
