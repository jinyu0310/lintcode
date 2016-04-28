package lintcode;

import datastructure.TreeNode;

public class FlattenBinaryTreetoLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    /**
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void flatten(TreeNode root) {
        // write your code here
    	if(root == null){
    		return;
    	}
    	//寻找左子树上最右子树
//    	while(root != null){
//        	while(root.left == null){
//        		if(root.right == null){
//        			return;
//        		}
//        		root = root.right;
//        	}
        	while(root != null){
        		//寻找左子树最右子结点
        		TreeNode first = root.left;
        		//和上面的while循环二取其一！
        		if (first == null) {
        			root = root.right;
					continue;
				}
        		while(first.right != null){
        			first = first.right;
        		}
        		//根节点右结点挂在左子树最右子结点的右结点处
        		first.right = root.right;
        		//左子树挂为根结点右子树
//        		root.right = first; //这里的first已经不是根结点左子树了
        		root.right = root.left;
        		//左子树设为null
        		root.left = null;
        		//根结点右移
        		root = root.right;
        	}
//    	}
    }
}
