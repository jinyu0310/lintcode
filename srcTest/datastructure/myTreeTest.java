package datastructure;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class myTreeTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInorderCreateTree() {
		myTree mytree = new myTree(2);
		char[] node = new char[]{'1','#','2','3'};
		mytree.inorderCreateTree(mytree.root, node);
		System.out.println(mytree.root.val);
		System.out.println(mytree.root.right.val);
//		assertEquals(2, mytree.root.right.val);
	}

}
