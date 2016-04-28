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
	
	//���Ǻ����������ݵ����⣿
	//�Ҵ�����mytree.root������root�ڵ�ȴû�б仯
	//�ݹ鴴�����������ڴ�����������ֻ����������Ϊ�ղŻ᷵����һ���
	public TreeNode inorderCreateTree(TreeNode r,char[] node){
		int length = node.length;
		if(i >= length){
			return null;
		}
		if(node[i] == '#'){
			r = null;
			i++;
		}else{
			//����r���½��Ľ�㣡r��id���ˣ��Ѿ����������һ����㣬���ĸ���㱾��û�б仯��
			if(r == null){
				r = new TreeNode((int)(node[i++]-'0')); //�ֲ�����r�����˺�����û���ˣ�r��֮ǰ��root.leftû�й�ϵ
			}else{
				r.val = (int)(node[i++]-'0');
			}
			r.left = inorderCreateTree(r.left, node); //���r.left���ݵĲ�����null
			r.right = inorderCreateTree(r.right, node);
		}
		return r;
	}
}
