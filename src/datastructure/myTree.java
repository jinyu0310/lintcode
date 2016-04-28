package datastructure;

public class myTree {
	public TreeNode root;
	public int i = 0;
	
	public myTree(){
		this.root = new TreeNode(0);
	}
	
	public myTree(int i){
		this.root = new TreeNode(i);
	}
	
	public myTree(TreeNode root){
		this.root = root;
	}
	
	//还是函数参数传递的问题？
	//我传的是mytree.root；但是root节点却没有变化
	//递归创建左子树，在创建右子树，只有左右子树为空才会返回上一结点
	public TreeNode inorderCreateTree(TreeNode r,char[] node){
		int length = node.length;
		if(i >= length){
			return null;
		}
		if(node[i] == '#'){
			r = null;
			i++;
		}else{
			//这里r是新建的结点！r的id变了，已经变成了另外一个结点，树的根结点本身没有变化！
			if(r == null){
				r = new TreeNode((int)(node[i++]-'0')); //局部变量r，出了函数就没有了，r和之前的root.left没有关系
			}else{
				r.val = (int)(node[i++]-'0');
			}
			r.left = inorderCreateTree(r.left, node); //这个r.left传递的参数是null
			r.right = inorderCreateTree(r.right, node);
		}
		return r;
	}
}
