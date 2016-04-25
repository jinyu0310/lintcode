package lintcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import datastructure.ListNode;
import datastructure.myList;

public class RemoveDuplicateFromSortedListIITest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDeleteDuplicates1() {
		myList myL = new myList(1);
		myL.add(1);myL.add(2);
		myL.add(2);myL.add(2);myL.add(2);myL.add(3);
		myList re = new myList(3);
		ListNode reHead = re.head;
		ListNode res = RemoveDuplicateFromSortedListII.deleteDuplicates(myL.head);
		while(reHead != null && res != null){
			System.out.println(reHead.val);
			System.out.println(res.val);
			assertEquals(reHead.val, res.val);
			reHead = reHead.next;
			res = res.next;
		}
	}
	
	@Test
	public void testDeleteDuplicates2() {
		myList myL = new myList(1);
		myL.add(1);myL.add(1);myL.add(2);
		myL.add(3);myL.add(4);myL.add(5);
		myList re = new myList(2);
		re.add(3);re.add(4);re.add(5);
		ListNode reHead = re.head;
		ListNode res = RemoveDuplicateFromSortedListII.deleteDuplicates(myL.head);
		while(reHead != null && res != null){
//			System.out.println(reHead.val);
//			System.out.println(res.val);
			assertEquals(reHead.val, res.val);
			reHead = reHead.next;
			res = res.next;
		}
	}
	
	@Test
	public void testDeleteDuplicates3() {
		myList myL = new myList(1);
		myL.add(1);myL.add(2);
		myL.add(3);myL.add(3);myL.add(3);myL.add(3);
		myList re = new myList(2);
		re.add(1);re.add(1);re.add(1);
		ListNode reHead = re.head;
		ListNode res = RemoveDuplicateFromSortedListII.deleteDuplicates(myL.head);
		while(reHead != null && res != null){
			System.out.println(reHead.val);
			System.out.println(res.val);
			assertEquals(reHead.val, res.val);
			reHead = reHead.next;
			res = res.next;
		}
	}

}
