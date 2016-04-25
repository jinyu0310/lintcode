package lintcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import datastructure.ListNode;
import datastructure.myList;

public class LinkedListCycleTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHasCycle1() {
		myList myL = new myList(1);
		myL.add(3);myL.add(5);
		myL.add(7);myL.add(9);
		myL.add(11);myL.add(12);
		ListNode myLHead = myL.head;
		myL.tail.next = myLHead.next.next;
		assertEquals(true, LinkedListCycle.hasCycle(myL.head));
	}
	
	@Test
	public void testHasCycle2() {
		myList myL = new myList(1);
		myL.add(3);myL.add(5);
		myL.add(7);myL.add(9);
		myL.add(11);myL.add(12);
		ListNode myLHead = myL.head;
//		myL.tail.next = myLHead.next.next;
		assertEquals(false, LinkedListCycle.hasCycle(myL.head));
	}

}
