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
    	//Ѱ������������������
//    	while(root != null){
//        	while(root.left == null){
//        		if(root.right == null){
//        			return;
//        		}
//        		root = root.right;
//        	}
        	while(root != null){
        		//Ѱ�������������ӽ��
        		TreeNode first = root.left;
        		//�������whileѭ����ȡ��һ��
        		if (first == null) {
        			root = root.right;
					continue;
				}
        		while(first.right != null){
        			first = first.right;
        		}
        		//���ڵ��ҽ����������������ӽ����ҽ�㴦
        		first.right = root.right;
        		//��������Ϊ�����������
//        		root.right = first; //�����first�Ѿ����Ǹ������������
        		root.right = root.left;
        		//��������Ϊnull
        		root.left = null;
        		//���������
        		root = root.right;
        	}
//    	}
    }
}
