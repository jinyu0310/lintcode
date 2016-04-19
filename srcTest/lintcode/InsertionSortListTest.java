package lintcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import datastructure.ListNode;
import datastructure.myList;

public class InsertionSortListTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsertionSortList() {
		myList myL = new myList(1);
		myL.add(1);myL.add(3);myL.add(4);
		myList re = new myList(1);
		re.add(1);re.add(3);re.add(4);
		ListNode reHead = re.head;
		ListNode res = InsertionSortList.insertionSortList(myL.head);
		while(reHead != null && res != null){
			System.out.println(reHead.val);
			System.out.println(res.val);
			assertEquals(reHead.val, res.val);
			reHead = reHead.next;
			res = res.next;

		}
	}

}
