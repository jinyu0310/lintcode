package lintcode;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import datastructure.TreeNode;

public class BinaryTreePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    /**
     * @param root the root of the binary tree
     * @return all root-to-leaf paths
     */
    public static List<String> binaryTreePaths(TreeNode root) {
    	List<String> res = new ArrayList<String>();
    	Stack<TreeNode> sPath = new Stack<TreeNode>(); //存储路径节点
    	
    	if (root == null) {
			return res;
		}
    	res.add(path(root,sPath));
		return res;
        // Write your code here
    }
    
    public static String path(TreeNode root,Stack<TreeNode> stack){
    	StringBuilder reString = new StringBuilder();
    	stack.push(root);
    	boolean isLeaf = root.left == null && root.right == null;
    	//根节点则
    	if(isLeaf){
    		Iterator<TreeNode> iter = stack.iterator();
    		while(iter.hasNext()){
    			reString.append(iter.next().val);
    			reString.append("->");
    		}
    		reString.delete(reString.length()-2, reString.length());  		
    	}
    	
    	if(root.left != null){
    		path(root.left, stack);
    	}
    	if(root.right != null){
    		path(root.right, stack);
    	}
		stack.pop();
		
		String res = new String(reString);
		return res;
    	
    }
    
    
    
}
