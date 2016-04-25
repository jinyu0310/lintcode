package lintcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import datastructure.ListNode;
import datastructure.myList;

public class RemoveDuplicateFromSortedListTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDeleteDuplicates() {
		myList myL = new myList(1);
		myL.add(1);myL.add(2);
		myL.add(2);myL.add(3);
		myList myr = new myList(5);
		myr.add(9);myr.add(2);
		myList re = new myList(1);
		re.add(2);re.add(3);
		ListNode reHead = re.head;
		ListNode res = RemoveDuplicateFromSortedList.deleteDuplicates2(myL.head);
		while(reHead != null && res != null){
//			System.out.println(reHead.val);
//			System.out.println(res.val);
			assertEquals(reHead.val, res.val);
			reHead = reHead.next;
			res = res.next;

		}
	}

}
