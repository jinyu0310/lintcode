package swordtooffer;

import static org.junit.Assert.*;
import lintcode.ReverseLinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import datastructure.ListNode;
import datastructure.myList;

public class ReverseListTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReverseList() {
		myList myL = new myList(1);
		myL.add(2);myL.add(3);
		myL.add(4);
		myList myr = new myList(5);
		myr.add(9);myr.add(2);
		myList re = new myList(4);
		re.add(3);re.add(2);re.add(1);
		ListNode reHead = re.head;
		ListNode res = ReverseList.ReverseList(myL.head);
		while(reHead != null && res != null){
			System.out.println(reHead.val);
			System.out.println(res.val);
			assertEquals(reHead.val, res.val);
			reHead = reHead.next;
			res = res.next;

		}
	}

}
