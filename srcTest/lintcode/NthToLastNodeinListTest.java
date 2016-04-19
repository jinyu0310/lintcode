package lintcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import datastructure.ListNode;
import datastructure.myList;

public class NthToLastNodeinListTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNthToLast1() {
		myList myL = new myList(1);
		myL.add(2);myL.add(6);myL.add(7);
		ListNode res = NthToLastNodeinList.nthToLast(myL.head, 2);
		assertEquals(6, res.val);
	}
	
	@Test
	public void testNthToLast2() {
		myList myL = new myList(1);
		myL.add(2);myL.add(6);myL.add(7);
		ListNode res = NthToLastNodeinList.nthToLast(myL.head, -1);
		assertEquals(null, res);
	}
	@Test
	public void testNthToLast3() {
		ListNode myL = null;
		ListNode res = NthToLastNodeinList.nthToLast(myL, 2);
		assertEquals(null, res);
	}

}
