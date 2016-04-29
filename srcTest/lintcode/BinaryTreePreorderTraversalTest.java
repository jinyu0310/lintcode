package lintcode;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import datastructure.myTree;

public class BinaryTreePreorderTraversalTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPreorderTraversalRecursive() {
		myTree mytree = new myTree(2);
		char[] node = new char[]{'1','2','4','#','7','#','#','5','#','#','3','#','6'};
		mytree.inorderCreateTree(mytree.root, node);
//		System.out.println(mytree.root.val);
//		System.out.println(mytree.root.left.val);
//		System.out.println(mytree.root.right.val);
//		System.out.println(mytree.root.left.left.val);
//		System.out.println(mytree.root.left.right.val);
//		System.out.println(mytree.root.right.right.val);
//		System.out.println(mytree.root.left.left.right.val);
		int[] myres = new int[]{1,2,4,7,5,3,6};
		ArrayList<Integer>  res = BinaryTreePreorderTraversal.preorderTraversalRecursive(mytree.root);
		for(int i = 0; i < myres.length;i++){
			assertEquals(myres[i], (int)res.get(i));
		}
	}

	@Test
	public void testPreorderTraversalStack() {
		myTree mytree = new myTree(2);
		char[] node = new char[]{'1','2','4','#','7','#','#','5','#','#','3','#','6'};
		mytree.inorderCreateTree(mytree.root, node);
//		System.out.println(mytree.root.val);
//		System.out.println(mytree.root.left.val);
//		System.out.println(mytree.root.right.val);
//		System.out.println(mytree.root.left.left.val);
//		System.out.println(mytree.root.left.right.val);
//		System.out.println(mytree.root.right.right.val);
//		System.out.println(mytree.root.left.left.right.val);
		int[] myres = new int[]{1,2,4,7,5,3,6};
		ArrayList<Integer>  res = BinaryTreePreorderTraversal.preorderTraversalStack(mytree.root);
		for(int i = 0; i < myres.length;i++){
//			System.out.println(res.get(i));
			assertEquals(myres[i], (int)res.get(i));
		}
	}

}
