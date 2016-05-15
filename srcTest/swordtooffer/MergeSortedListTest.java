package swordtooffer;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import datastructure.ListNode;
import datastructure.myList;

public class MergeSortedListTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMerge() {
		myList myL = new myList(1);
		myL.add(2);myL.add(5);
		myList myr = new myList(3);
		myr.add(4);myr.add(6);
		myList re = new myList(1);
		re.add(2);re.add(3);re.add(4);
		re.add(5);re.add(6);
		ListNode reHead = re.head;
		ListNode res = MergeSortedList.Merge(myL.head,myr.head);
		while(reHead != null && res != null){
			System.out.println(reHead.val);
			System.out.println(res.val);
			assertEquals(reHead.val, res.val);
			reHead = reHead.next;
			res = res.next;

		}
	}

}
