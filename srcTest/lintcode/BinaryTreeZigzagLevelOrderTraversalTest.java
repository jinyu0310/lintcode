package lintcode;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import datastructure.myTree;

public class BinaryTreeZigzagLevelOrderTraversalTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testZigzagLevelOrder() {
		myTree mytree = new myTree(2);
		char[] node = new char[]{'3','9','#','#','1','5','#','#','7'};
		mytree.inorderCreateTree(mytree.root, node);
//		System.out.println(mytree.root.val);
//		System.out.println(mytree.root.left.val);
//		System.out.println(mytree.root.right.val);
//		System.out.println(mytree.root.right.left.val);
//		System.out.println(mytree.root.right.right.val);
		ArrayList res = BinaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(mytree.root);
//		System.out.println(res.size());
		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i));
		}
	}

}
